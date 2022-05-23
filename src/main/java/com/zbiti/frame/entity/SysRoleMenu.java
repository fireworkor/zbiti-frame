package com.zbiti.frame.entity;


import com.zbiti.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

/**
 * 角色和菜单关联 sys_role_menu
 *
 * @author zbiti
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Accessors(chain = true)
public class SysRoleMenu extends BaseEntity
{
    /** 角色ID */
    private String roleId;

    /** 菜单ID */
    private String menuId;

}
