package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysDict;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysDictRepository extends JpaRepository<SysDict, String> {

}
