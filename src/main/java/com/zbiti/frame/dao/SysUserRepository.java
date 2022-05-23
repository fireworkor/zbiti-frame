package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends JpaRepository<SysUser, String> {

}
