package com.zbiti.frame.entity;

import com.zbiti.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

/**
 * 文件信息
 *
 * @author zbiti
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Accessors(chain = true)
public class SysFile extends BaseEntity
{
    /**
     * 文件名称
     */
    private String name;

    /**
     * 文件地址
     */
    private String url;


}
