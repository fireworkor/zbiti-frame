package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysConfigRepository;
import com.zbiti.frame.entity.SysConfig;
import com.zbiti.frame.service.SysConfigService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller("/sys/config")
public class SysConfigController {
    @Resource
    SysConfigRepository repository;
    @Resource
    SysConfigService    service;
    //增  //改
    @PutMapping
    <S extends SysConfig> S saveAndFlush(S entity) {
        return repository.save(entity);
    }
    @PutMapping
    <S extends SysConfig> List<SysConfig> saveAll(Iterable<SysConfig> entities) {
        return repository.saveAll(entities);
    }

    //删
    @DeleteMapping
    void deleteAllByIdInBatch(Iterable<String> ids) {
        repository.deleteAllByIdInBatch(ids);
    }

    @DeleteMapping
    void deleteAllInBatch(Iterable<SysConfig> entities) {
        repository.deleteAllInBatch(entities);
    }

    //查
    @GetMapping("/{id}")
    SysConfig gegetReferenceByIdById(@PathVariable String id) {
        return repository.getReferenceById(id);
    }
    @GetMapping
    List<SysConfig> findAllById(@RequestBody Iterable<String> ids) {
        return repository.findAllById(ids);
    }
    @GetMapping
    <S extends SysConfig> List<S> findAll( Example<S> example) {
        return repository.findAll(example);
    }
    @GetMapping
    <S extends SysConfig> List<S> findAll(Example<S> example, Sort sort) {
        return repository.findAll(example, sort);
    }
    @GetMapping
    Page<SysConfig> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }


}
