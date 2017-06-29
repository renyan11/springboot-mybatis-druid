package com.wanger.dao;

import com.wanger.domain.SysDictEntity;

public interface SysDictDao {

    public int deleteByPrimaryKey(String dict_code);

    public int insertSelective(SysDictEntity record);

    public SysDictEntity selectByPrimaryKey(String dict_code);

    public int updateByPrimaryKeySelective(SysDictEntity record);

}