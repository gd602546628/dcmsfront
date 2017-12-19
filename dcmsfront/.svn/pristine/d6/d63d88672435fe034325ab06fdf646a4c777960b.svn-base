package com.kissdental.weixin.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dartagnan on 2017/12/19.
 */
@Controller
@RequestMapping("/manage")
public class ManageController {

    @RequestMapping("/welcome")
    public String manage() {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser && currentUser.isAuthenticated()) {
            return "manage";
        }
        return "redirect:login.do";
    }
}
