package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysPostRepository;
import com.zbiti.frame.service.SysPostService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/post")
public class SysPostController {
    @Resource
    SysPostRepository repository;
    @Resource
    SysPostService    service;
}
