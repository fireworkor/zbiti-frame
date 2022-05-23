package com.zbiti.frame.entity;

import com.zbiti.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

/**
 * 用户和岗位关联 sys_user_post
 * @author zbiti
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Accessors(chain = true)
public class SysUserPost extends BaseEntity
{
    /** 用户ID */
    private String userId;

    /** 岗位ID */
    private String postId;

}
