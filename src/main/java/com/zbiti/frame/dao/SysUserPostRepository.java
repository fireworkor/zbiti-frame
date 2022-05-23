package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysUserPost;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysUserPostRepository extends JpaRepository<SysUserPost, String> {

}
