package com.zbiti.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@MappedSuperclass//实体继承映射
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    public String id;
    public String createBy;
    public Date   createTime;
    public String updateBy;
    public Date   updateTime;
    public String delFlag;
}
