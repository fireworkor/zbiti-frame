package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysUserMenuRepository;
import com.zbiti.frame.service.SysUserMenuService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/user/menu")
public class SysUserMenuController {
    @Resource
    SysUserMenuRepository repository;
    @Resource
    SysUserMenuService    service;
}
