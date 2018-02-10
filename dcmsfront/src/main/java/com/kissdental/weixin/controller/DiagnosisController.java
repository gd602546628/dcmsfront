package com.kissdental.weixin.controller;

import com.kissdental.weixin.common.ApiResult;
import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.entity.DiagnosisPay;
import com.kissdental.weixin.entity.DiagnosisResult;
import com.kissdental.weixin.entity.Link;
import com.kissdental.weixin.service.DiagnosisPayService;
import com.kissdental.weixin.service.DiagnosisResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dartagnan on 2018/1/5.
 */
@Controller
@RequestMapping("/diagnosis")
public class DiagnosisController {

    @Autowired
    private DiagnosisPayService diagnosisPayService;

    @Autowired
    private DiagnosisResultService diagnosisResultService;

    @ResponseBody
    @RequestMapping("/findPayList")
    public ApiResult findPayList(DiagnosisPay diagnosisPay, HttpServletResponse response, HttpServletRequest request){
        ApiResult result = new ApiResult(response);
        Page<DiagnosisPay> page = diagnosisPayService.findPage(new Page<DiagnosisPay>(request, response), diagnosisPay, true);
        result.setPageData(page);
        result.setCode(ApiResult.CODE_SUCCESS);
        result.setMesg("查询成功");
        return result;
    }

    @ResponseBody
    @RequestMapping("/findResultList")
    public ApiResult findResultList(DiagnosisResult diagnosisResult,HttpServletResponse response,HttpServletRequest request){
        ApiResult result = new ApiResult(response);
        Page<DiagnosisResult> page = diagnosisResultService.findPage(new Page<DiagnosisResult>(request,response),diagnosisResult,true);
        result.setPageData(page);
        result.setCode(ApiResult.CODE_SUCCESS);
        result.setMesg("查询成功");
        return result;
    }
}
