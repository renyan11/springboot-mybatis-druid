package com.wanger.dao;

import com.wanger.domain.SysMenuEntity;

public interface SysMenuDao {

    public int deleteByPrimaryKey(String menu_code);

    public int insertSelective(SysMenuEntity record);

    public SysMenuEntity selectByPrimaryKey(String menu_code);

    public int updateByPrimaryKeySelective(SysMenuEntity record);

}