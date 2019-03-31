package com.vrv.vap.mapper;

import com.vrv.vap.model.SysUser;
import com.vrv.vap.model.SysUserWithBLOBs;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserWithBLOBs record);

    int insertSelective(SysUserWithBLOBs record);

    SysUserWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysUserWithBLOBs record);

    int updateByPrimaryKey(SysUser record);
}