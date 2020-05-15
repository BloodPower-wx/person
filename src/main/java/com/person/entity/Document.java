package com.person.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Document)实体类
 *
 * @author makejava
 * @since 2020-05-14 16:06:03
 */
public class Document implements Serializable {
    private static final long serialVersionUID = 487391246359231814L;
    
    private Integer id;
    
    private String title;
    
    private String filename;
    
    private String remark;
    
    private Date createdate;
    
    private Integer userid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

}