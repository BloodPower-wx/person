package com.person.entity;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2020-05-14 16:06:00
 */
public class Dept implements Serializable {
    private static final long serialVersionUID = -71243239796672703L;
    
    private Integer id;
    
    private String name;
    
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}