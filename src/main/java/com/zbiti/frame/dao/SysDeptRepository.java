package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDeptRepository extends JpaRepository<SysDept, String> {

}
