package com.xsl.service;/**
 * Created by msi- on 2018/3/17.
 */

import com.alibaba.dubbo.config.annotation.Service;
import com.xsl.model.LoginReq;
import com.xsl.model.User;

/**
 * @program: shopping
 * @description:
 * @author: XSL
 * @create: 2018-03-17 17:21
 **/
@Service( version= "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public User login(LoginReq loginReq) {
        return null;
    }
}
