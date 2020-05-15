package com.person.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Notice)实体类
 *
 * @author makejava
 * @since 2020-05-14 16:06:03
 */
public class Notice implements Serializable {
    private static final long serialVersionUID = 136421730691584630L;
    
    private Integer id;
    
    private String title;
    
    private String content;
    
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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