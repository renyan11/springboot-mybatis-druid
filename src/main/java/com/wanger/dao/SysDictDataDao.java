package com.wanger.dao;

import com.wanger.domain.SysDictDataEntity;

public interface SysDictDataDao {

    public int deleteByPrimaryKey(Integer id);

    public int insertSelective(SysDictDataEntity record);

    public SysDictDataEntity selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(SysDictDataEntity record);

}