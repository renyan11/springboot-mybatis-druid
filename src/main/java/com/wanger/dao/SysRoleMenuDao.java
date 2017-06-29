package com.wanger.dao;

import com.wanger.domain.SysRoleMenuEntity;

public interface SysRoleMenuDao {

    public int deleteByPrimaryKey(Integer id);

    public int insertSelective(SysRoleMenuEntity record);

    public SysRoleMenuEntity selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(SysRoleMenuEntity record);

}