package com.wanger.dao;

import com.wanger.domain.SysRoleEntity;

public interface SysRoleDao {

    public int deleteByPrimaryKey(String role_code);

    public int insertSelective(SysRoleEntity record);

    public SysRoleEntity selectByPrimaryKey(String role_code);

    public int updateByPrimaryKeySelective(SysRoleEntity record);

}