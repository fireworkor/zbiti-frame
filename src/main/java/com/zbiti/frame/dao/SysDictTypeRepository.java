package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysDictType;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysDictTypeRepository extends JpaRepository<SysDictType, String> {

}
