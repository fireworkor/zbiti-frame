package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysDictTypeRepository;
import com.zbiti.frame.service.SysDictTypeService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/dictType")
public class SysDictTypeController {
    @Resource
    SysDictTypeRepository repository;
    @Resource
    SysDictTypeService    service;
}
