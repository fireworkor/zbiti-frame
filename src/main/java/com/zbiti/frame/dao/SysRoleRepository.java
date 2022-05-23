package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;


@Repository
public interface SysRoleRepository extends JpaRepository<SysRole, String> {

}
