package com.zbiti.frame.entity;

import com.zbiti.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

/**
 * 角色和部门关联 sys_role_dept
 *
 * @author zbiti
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Accessors(chain = true)
public class SysRoleDept extends BaseEntity
{
    /** 角色ID */
    private String roleId;

    /** 部门ID */
    private String deptId;


}
