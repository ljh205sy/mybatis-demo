package com.vrv.vap.model;

import java.io.Serializable;

public class SysUserWithBLOBs extends SysUser implements Serializable {
    /**
     * 简介
     */
    private String userInfo;

    /**
     * 头像
     */
    private byte[] headImg;

    /**
     * sys_user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 简介
     * @return user_info 简介
     */
    public String getUserInfo() {
        return userInfo;
    }

    /**
     * 简介
     * @param userInfo 简介
     */
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    /**
     * 头像
     * @return head_img 头像
     */
    public byte[] getHeadImg() {
        return headImg;
    }

    /**
     * 头像
     * @param headImg 头像
     */
    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }
}