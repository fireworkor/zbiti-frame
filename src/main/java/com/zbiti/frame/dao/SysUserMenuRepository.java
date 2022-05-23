package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysUserMenu;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMenuRepository extends JpaRepository<SysUserMenu, String> {

}
