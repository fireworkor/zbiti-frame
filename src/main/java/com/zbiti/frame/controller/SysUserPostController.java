package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysUserPostRepository;
import com.zbiti.frame.service.SysUserPostService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/user/post")
public class SysUserPostController {
    @Resource
    SysUserPostRepository repository;
    @Resource
    SysUserPostService    service;
}
