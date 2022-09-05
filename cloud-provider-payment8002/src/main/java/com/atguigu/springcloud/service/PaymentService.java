package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int createPayment(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
