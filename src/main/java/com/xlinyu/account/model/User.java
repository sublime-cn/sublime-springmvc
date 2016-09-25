package com.xlinyu.account.model;

import org.mybatis.extension.auto.annotation.Column;
import org.mybatis.extension.auto.annotation.Id;
import org.mybatis.extension.auto.annotation.Table;

/**
 * Created by gavin on 20/09/2016.
 */
@Table(tableName = "sys_user", comment = "用户表")
public class User {

    @Column(columnName = "id", nullable = false, comment = "主键id")
    @Id
    private String id;

    @Column(columnName = "usernane", comment = "用户名")
    private String username;

    @Column(columnName = "password", comment = "用户密码")
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
