package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysUserRepository;
import com.zbiti.frame.service.SysUserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/user")
public class SysUserController {
    @Resource
    SysUserRepository repository;
    @Resource
    SysUserService    service;
}
