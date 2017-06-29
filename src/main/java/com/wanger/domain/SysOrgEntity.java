package com.wanger.domain;

import java.util.Date;

/**
 * @ClassName SysOrgEntity
 * @Description 组织机构表
 * @author wangjieya
 * @date 2017-04-20 08:56:32
 * @version 1.0 
 */
public class SysOrgEntity {

    //机构ID
    private String org_code;
    //父级机构ID
    private String p_org_code;
    //机构名称
    private String org_name;
    //图标
    private String icon;
    //排序
    private Integer order_no;
    //描述
    private String decription;
    //创建时间
    private Date create_time;
    //修改时间
    private Date modify_time;
    //是否删除
    private Integer is_del;

    public String getOrg_code() {
        return org_code;
    }
    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }
    public String getP_org_code() {
        return p_org_code;
    }
    public void setP_org_code(String p_org_code) {
        this.p_org_code = p_org_code;
    }
    public String getOrg_name() {
        return org_name;
    }
    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Integer getOrder_no() {
        return order_no;
    }
    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
    }
    public String getDecription() {
        return decription;
    }
    public void setDecription(String decription) {
        this.decription = decription;
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