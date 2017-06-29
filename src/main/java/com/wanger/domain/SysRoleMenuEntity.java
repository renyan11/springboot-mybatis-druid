package com.wanger.domain;

import java.util.Date;

/**
 * @ClassName SysRoleMenuEntity
 * @Description 角色菜单表
 * @author wangjieya
 * @date 2017-04-20 08:56:32
 * @version 1.0 
 */
public class SysRoleMenuEntity {

    //主键
    private Integer id;
    //角色ID
    private String role_code;
    //菜单ID
    private String menu_code;
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
    public String getRole_code() {
        return role_code;
    }
    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }
    public String getMenu_code() {
        return menu_code;
    }
    public void setMenu_code(String menu_code) {
        this.menu_code = menu_code;
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