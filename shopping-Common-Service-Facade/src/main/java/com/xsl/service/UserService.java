package com.xsl.service;/**
 * Created by msi- on 2018/3/17.
 */

import com.xsl.model.LoginReq;
import com.xsl.model.User;

/**
 * @program: shopping
 * @description:
 * @author: XSL
 * @create: 2018-03-17 16:59
 **/

public interface UserService {
    public User login(LoginReq loginReq);
}
