package com.atguigu.spring.alibaba.service.impl;

import com.atguigu.spring.alibaba.dao.OrderDao;
import com.atguigu.spring.alibaba.domain.Order;
import com.atguigu.spring.alibaba.service.AccountService;
import com.atguigu.spring.alibaba.service.OrderService;
import com.atguigu.spring.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional(name = "create-order", rollbackFor = Exception.class)
    public void create(Order order) {
        // 1. 新建订单
        log.info("---------> 开始新建订单");
        orderDao.create(order);

        // 2. 扣减库存
        log.info("---------> 订单微服务开始调用库存，扣减数量");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("---------> 订单微服务开始调用库存，扣减结束");

        // 3. 扣减账户
        log.info("---------> 订单微服务开始调用账户，扣减钱");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("---------> 订单微服务开始调用账户，扣减钱end");

        // 4. 修改订单状态 从0到1
        log.info("---------> 修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("---------> 修改订单状态结束");

        log.info("---------> 下订单结束了");
    }
}
