package com.hlllg.usercenter.service;

import com.hlllg.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author HLLLG
 * @description 针对表【user(用户表)】的数据库操作Service
 * @createDate 2024-03-02 15:06:54
 */
public interface UserService extends IService<User> {


    /**
     * 用户注册
     *
     * @param userAccount   账户
     * @param userPassword  密码
     * @param checkPassword 校验密码
     * @param planetCode    星球编号
     * @return 用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount  账户
     * @param userPassword 密码
     * @param request
     * @return 展示用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param OriginalUser
     * @return 用户信息
     */
    User getSafetyUser(User OriginalUser);

    /**
     * 用户注销
     *
     * @return
     */
    int userLogout(HttpServletRequest request);

}
