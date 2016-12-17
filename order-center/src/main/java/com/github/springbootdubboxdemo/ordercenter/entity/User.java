package com.github.springbootdubboxdemo.ordercenter.entity;

import java.time.LocalDateTime;

/**
 * 用户实体
 * Created by root on 2016/12/17 0017.
 */
public class User {
    private Long id;
    private String name;
    private String mobile;
    private String idCard;
    private Integer state;
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", idCard='").append(idCard).append('\'');
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
