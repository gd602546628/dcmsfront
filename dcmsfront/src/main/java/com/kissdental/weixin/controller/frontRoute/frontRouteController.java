package com.kissdental.weixin.controller.frontRoute;

import org.springframework.stereotype.Controller;
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
}
