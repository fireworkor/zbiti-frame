package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysDeptRepository;
import com.zbiti.frame.service.SysDeptService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/dept")
public class SysDeptController {
    @Resource
    SysDeptRepository repository;
    @Resource
    SysDeptService    service;
}
