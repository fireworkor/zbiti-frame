package com.zbiti.frame.dao;

import com.zbiti.frame.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface SysLogRepository extends JpaRepository<SysLog, String> {

}
