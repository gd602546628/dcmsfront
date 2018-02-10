package com.kissdental.weixin.controller.frontRoute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/front")
public class frontRouteController {
    @RequestMapping(value = "/wxIndex", method = RequestMethod.GET)
    public String index() {
        return "wxIndex/index";
    }

    @RequestMapping(value = "/articleList", method = RequestMethod.GET)
    public String articleList() {
        return "wxIndex/articleList";
    }

    @RequestMapping(value = "/articleData", method = RequestMethod.GET)
    public String articleData() {
        return "wxIndex/articleData";
    }

    @RequestMapping(value = "/medicalResource", method = RequestMethod.GET)
    public String medicalResource() {
        return "medicalResource/medicalResource";
    }

    @RequestMapping(value = "/appointment", method = RequestMethod.GET)
    public String appointment() {
        return "wxIndex/appointment";
    }

    @RequestMapping(value = "/couponList", method = RequestMethod.GET)
    public String couponList() {
        return "wxIndex/couponList";
    }

    @RequestMapping(value = "/linkList", method = RequestMethod.GET)
    public String linkList() {
        return "wxIndex/linkList";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(String referrerCode, Model model) {
        model.addAttribute("referrerCode",referrerCode);
        return "wxIndex/register";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo() {
        return "userInfo/userInfo";
    }
}
