package com.xsl.web;/**
 * Created by msi- on 2018/3/17.
 */

import com.alibaba.dubbo.config.annotation.Reference;
import com.sun.deploy.net.HttpResponse;
import com.xsl.model.LoginReq;
import com.xsl.model.Result;
import com.xsl.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: shopping
 * @description:
 * @author: XSL
 * @create: 2018-03-17 17:32
 **/
@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public Result login(LoginReq loginReq, HttpResponse response) {
        return null;
    }
}
