package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysFile;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysFileRepository extends JpaRepository<SysFile, String> {

}
