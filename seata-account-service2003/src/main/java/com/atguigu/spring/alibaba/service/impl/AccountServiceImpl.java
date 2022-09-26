package com.atguigu.spring.alibaba.service.impl;

import com.atguigu.spring.alibaba.dao.AccountDao;
import com.atguigu.spring.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, Integer money) {
        log.info("------account开始了");
        accountDao.decrease(userId, money);
        log.info("------account结束了");
    }
}
