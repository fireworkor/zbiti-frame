package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysLogRepository;
import com.zbiti.frame.service.SysLogService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/log")
public class SysLogController {
    @Resource
    SysLogRepository repository;
    @Resource
    SysLogService    service;
}
