package com.atguigu.spring.alibaba.controller;

import com.atguigu.spring.alibaba.domain.CommonResult;
import com.atguigu.spring.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") Integer money){
        accountService.decrease(userId, money);
        int age = 3 / 0;
        return new CommonResult(200, "扣减账户余额成功");
    }

}
