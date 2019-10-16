package com.example.demo.user.controller;


import com.example.demo.user.entity.User;
import com.example.demo.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fry
 * @since 2019-08-27
 */
@RestController
@RequestMapping("/user/user")
@Api(tags = "人员管理接口",description = "V1.0")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/list")
    @ApiOperation("获取人员列表")
    public List<User> users(){
        return iUserService.list();
    }



}
