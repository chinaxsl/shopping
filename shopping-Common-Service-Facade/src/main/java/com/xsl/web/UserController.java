package com.xsl.web;

import com.xsl.model.LoginReq;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by msi- on 2018/3/17.
 */
public interface UserController {
    public Result login(LoginReq loginReq, HttpServletRequest request);
}
