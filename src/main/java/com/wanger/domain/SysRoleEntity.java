package com.wanger.domain;

import java.util.Date;

/**
 * @ClassName SysRoleEntity
 * @Description 角色表
 * @author wangjieya
 * @date 2017-04-20 08:56:32
 * @version 1.0 
 */
public class SysRoleEntity {

    //主键
    private String role_code;
    //角色名称
    private String role_name;
    //排序
    private Integer order_no;
    //描述
    private String description;
    //创建时间
    private Date create_time;
    //修改时间
    private Date modify_time;
    //是否删除
    private Integer is_del;

    public String getRole_code() {
        return role_code;
    }
    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }
    public String getRole_name() {
        return role_name;
    }
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
    public Integer getOrder_no() {
        return order_no;
    }
    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getCreate_time() {
        return create_time;
    }
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    public Date getModify_time() {
        return modify_time;
    }
    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }
    public Integer getIs_del() {
        return is_del;
    }
    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }

}