package com.wanger.domain;

import java.util.Date;

/**
 * @ClassName SysUserRoleEntity
 * @Description 用户信息表
 * @author wangjieya
 * @date 2017-04-20 08:56:32
 * @version 1.0 
 */
public class SysUserRoleEntity {

    //主键
    private Integer id;
    //用户ID
    private String user_code;
    //角色ID
    private String role_code;
    //创建时间
    private Date create_time;
    //修改时间
    private Date modify_time;
    //是否删除
    private Integer is_del;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUser_code() {
        return user_code;
    }
    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }
    public String getRole_code() {
        return role_code;
    }
    public void setRole_code(String role_code) {
        this.role_code = role_code;
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