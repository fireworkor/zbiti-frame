package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysUserRole;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleRepository extends JpaRepository<SysUserRole, String> {

}
