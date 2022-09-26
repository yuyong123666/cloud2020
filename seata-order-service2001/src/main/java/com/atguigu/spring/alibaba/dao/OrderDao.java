package com.atguigu.spring.alibaba.dao;

import com.atguigu.spring.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {
    // 新建订单
    void create(Order order);

    // 2. 修改订单状态
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
