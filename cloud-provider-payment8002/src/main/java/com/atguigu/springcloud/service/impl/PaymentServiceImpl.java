package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int createPayment(Payment payment) {

        return paymentDao.createPayment(payment);

    }

    @Override
    public Payment getPaymentById(Long id) {

        return paymentDao.getPaymentById(id);

    }
}
