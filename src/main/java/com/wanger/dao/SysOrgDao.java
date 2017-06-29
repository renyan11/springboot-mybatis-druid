package com.wanger.dao;

import com.wanger.domain.SysOrgEntity;

public interface SysOrgDao {

    public int deleteByPrimaryKey(String org_code);

    public int insertSelective(SysOrgEntity record);

    public SysOrgEntity selectByPrimaryKey(String org_code);

    public int updateByPrimaryKeySelective(SysOrgEntity record);

}