package com.atguigu.spring.alibaba.service.impl;

import com.atguigu.spring.alibaba.dao.StorageMapper;
import com.atguigu.spring.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;


    @Override
    public void decrease(Long productId, Integer count) {
        log.info("--------storage开始");
        storageMapper.decrease(productId, count);
        log.info("--------storage结束");
    }
}
