package com.wanger.domain;

import java.util.Date;

/**
 * @ClassName SysMenuEntity
 * @Description 菜单表
 * @author wangjieya
 * @date 2017-04-20 08:56:32
 * @version 1.0 
 */
public class SysMenuEntity {

    //主键
    private String menu_code;
    //菜单名
    private String menu_name;
    //父级菜单ID
    private String p_menu_code;
    //权重
    private Integer level;
    //菜单地址
    private String url;
    //图标
    private String icon;
    //是否菜单 1:菜单 0:模块
    private Integer is_menu;
    //排序
    private Integer order_no;
    //创建时间
    private Date create_time;
    //修改时间
    private Date modify_time;
    //是否删除 1:删除 0:未删
    private Integer is_del;

    public String getMenu_code() {
        return menu_code;
    }
    public void setMenu_code(String menu_code) {
        this.menu_code = menu_code;
    }
    public String getMenu_name() {
        return menu_name;
    }
    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }
    public String getP_menu_code() {
        return p_menu_code;
    }
    public void setP_menu_code(String p_menu_code) {
        this.p_menu_code = p_menu_code;
    }
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Integer getIs_menu() {
        return is_menu;
    }
    public void setIs_menu(Integer is_menu) {
        this.is_menu = is_menu;
    }
    public Integer getOrder_no() {
        return order_no;
    }
    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
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