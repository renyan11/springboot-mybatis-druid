package com.wanger.domain;

import java.util.Date;

/**
 * @ClassName SysDictDataEntity
 * @Description 数据字典表
 * @author wangjieya
 * @date 2017-04-20 08:56:32
 * @version 1.0 
 */
public class SysDictDataEntity {

    //主键
    private Integer id;
    //数据类别ID
    private String dict_code;
    //数据值
    private String dictdata_value;
    //数据名称
    private String dictdata_name;
    //是否可读
    private Integer is_fixed;
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

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDict_code() {
        return dict_code;
    }
    public void setDict_code(String dict_code) {
        this.dict_code = dict_code;
    }
    public String getDictdata_value() {
        return dictdata_value;
    }
    public void setDictdata_value(String dictdata_value) {
        this.dictdata_value = dictdata_value;
    }
    public String getDictdata_name() {
        return dictdata_name;
    }
    public void setDictdata_name(String dictdata_name) {
        this.dictdata_name = dictdata_name;
    }
    public Integer getIs_fixed() {
        return is_fixed;
    }
    public void setIs_fixed(Integer is_fixed) {
        this.is_fixed = is_fixed;
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