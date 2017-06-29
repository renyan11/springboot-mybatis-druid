package com.wanger.domain;

import java.util.Date;

/**
 * @ClassName SysDictEntity
 * @Description 数据字典表
 * @author wangjieya
 * @date 2017-04-20 08:56:32
 * @version 1.0 
 */
public class SysDictEntity {

    //主键
    private String dict_code;
    //字典名字
    private String dict_name;
    //字典分组
    private String dict_group;
    //排序
    private Integer order_no;
    //说明
    private String description;
    //创建时间
    private Date create_time;
    //修改时间
    private Date modify_time;
    //是否删除
    private Integer is_del;

    public String getDict_code() {
        return dict_code;
    }
    public void setDict_code(String dict_code) {
        this.dict_code = dict_code;
    }
    public String getDict_name() {
        return dict_name;
    }
    public void setDict_name(String dict_name) {
        this.dict_name = dict_name;
    }
    public String getDict_group() {
        return dict_group;
    }
    public void setDict_group(String dict_group) {
        this.dict_group = dict_group;
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