package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysDictRepository;
import com.zbiti.frame.service.SysDictService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/dict")
public class SysDictController {
    @Resource
    SysDictRepository repository;
    @Resource
    SysDictService    service;
}
