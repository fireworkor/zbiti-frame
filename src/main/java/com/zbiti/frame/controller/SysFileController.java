package com.zbiti.frame.controller;

import com.zbiti.frame.dao.SysFileRepository;
import com.zbiti.frame.entity.SysFile;
import com.zbiti.frame.service.SysFileService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller("/sys/file")
public class SysFileController {
    @Resource
    SysFileRepository repository;
    @Resource
    SysFileService    service;

    //增  //改
    @PutMapping
    <S extends SysFile> S saveAndFlush(S entity) {
        return repository.save(entity);
    }
    @PutMapping
    <S extends SysFile> List<SysFile> saveAll(Iterable<SysFile> entities) {
        return repository.saveAll(entities);
    }

    //删
    @DeleteMapping
    void deleteAllByIdInBatch(Iterable<String> ids) {
        repository.deleteAllByIdInBatch(ids);
    }

    @DeleteMapping
    void deleteAllInBatch(Iterable<SysFile> entities) {
        repository.deleteAllInBatch(entities);
    }

    //查
    @GetMapping("/{id}")
    SysFile gegetReferenceByIdById(@PathVariable String id) {
        return repository.getReferenceById(id);
    }
    @GetMapping
    List<SysFile> findAllById(@RequestBody Iterable<String> ids) {
        return repository.findAllById(ids);
    }
    @GetMapping
    <S extends SysFile> List<S> findAll( Example<S> example) {
        return repository.findAll(example);
    }
    @GetMapping
    <S extends SysFile> List<S> findAll(Example<S> example, Sort sort) {
        return repository.findAll(example, sort);
    }
    @GetMapping
    Page<SysFile> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
