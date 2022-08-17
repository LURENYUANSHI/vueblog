package com.yys.controller;


import com.yys.common.lang.R;
import com.yys.entity.User;
import com.yys.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;
    @GetMapping("/index")
    public R index(){

        log.info("id:{}",userService.getById(1));
        return R.success(userService.getById(1));
    }



}
