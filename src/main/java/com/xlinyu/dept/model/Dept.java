package com.xlinyu.dept.model;

import org.mybatis.extension.auto.annotation.Column;
import org.mybatis.extension.auto.annotation.Id;
import org.mybatis.extension.auto.annotation.Table;

@Table(tableName = "sys_dept", comment = "组织机构")
public class Dept {

    @Column(columnName = "id", length = 36, nullable = false, comment = "组织机构主键id")
    @Id
    private String id;

    @Column(columnName = "parent_id", comment = "上级组织机构id")
    private String parentId;

    @Column(columnName = "path", comment = "组织机构代码")
    private String path;

    @Column(columnName = "name", comment = "机构名称")
    private String name;

    @Column(columnName = "alias_name", comment = "机构简称")
    private String aliasName;

    @Column(columnName = "remark", comment = "备注")
    private String remark;

    @Column(columnName = "address", comment = "地址")
    private String address;

    @Column(columnName = "telephone", comment = "联系方式")
    private String telephone;

    @Column(columnName = "email", comment = "电子邮件")
    private String email;

    @Column(columnName = "website", comment = "网址")
    private String website;

    @Column(columnName = "has_children", comment = "是否有子节点")
    private int hasChildren;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(int hasChildren) {
        this.hasChildren = hasChildren;
    }
}