package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysUserRoleRepository;
import com.zbiti.frame.service.SysUserRoleService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/userRole")
public class SysUserRoleController {
    @Resource
    SysUserRoleRepository repository;
    @Resource
    SysUserRoleService    service;
}
