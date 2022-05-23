package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysPost;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysPostRepository extends JpaRepository<SysPost, String> {

}
