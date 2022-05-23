package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysRoleRepository;
import com.zbiti.frame.service.SysRoleService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/role")
public class SysRoleController {
    @Resource
    SysRoleRepository repository;
    @Resource
    SysRoleService    service;
}
