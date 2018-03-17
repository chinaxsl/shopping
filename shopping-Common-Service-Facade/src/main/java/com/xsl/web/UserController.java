package com.xsl.web;

import com.sun.deploy.net.HttpResponse;
import com.xsl.model.LoginReq;
import com.xsl.model.Result;


/**
 * Created by msi- on 2018/3/17.
 */
public interface UserController {
    public Result login(LoginReq loginReq, HttpResponse response);
}
