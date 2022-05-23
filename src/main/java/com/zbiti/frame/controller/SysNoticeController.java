package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysNoticeRepository;
import com.zbiti.frame.service.SysNoticeService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/sys/notice")
public class SysNoticeController {
    @Resource
    SysNoticeRepository repository;
    @Resource
    SysNoticeService    service;
}
