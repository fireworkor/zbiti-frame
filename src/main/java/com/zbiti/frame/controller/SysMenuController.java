package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysMenuRepository;
import com.zbiti.frame.service.SysMenuService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/menu")
public class SysMenuController {
    @Resource
    SysMenuRepository repository;
    @Resource
    SysMenuService    service;
}
