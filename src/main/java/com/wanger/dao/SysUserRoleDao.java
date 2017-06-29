package com.wanger.dao;

import com.wanger.domain.SysUserRoleEntity;

public interface SysUserRoleDao {

    public int deleteByPrimaryKey(Integer id);

    public int insertSelective(SysUserRoleEntity record);

    public SysUserRoleEntity selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(SysUserRoleEntity record);

}