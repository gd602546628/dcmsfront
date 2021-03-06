package com.kissdental.weixin.common;


import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dartagnan on 17/10/23.
 */
public class ApiResult {
	 /** 接口版本号 */
    public static final String API_VERSION = "1.0";
    /** 成功 */
    public static final String CODE_SUCCESS = "000000";
    /** 失败，如参数格式错误 */
    public static final String CODE_FAILURE = "000001";
    /** 请求参数有误 */
    public static final String CODE_PARAM_INCORRECT = "000002";
    /** 出错，一般为系统内部出错等 */
    public static final String CODE_ERROR = "000003";
    /** 用户名密码错误*/
    public static final String COOE_LOGIN_ERROR = "000004";
    /** 用户未登录*/
    public static final String CODE_NOT_LOGIN = "000005";
    /** 用户未授权*/
    public static final String CODE_UNAUTH = "000006";
    /**号码已经存在*/
    public static final String CODE_NUMBER_ALREADY_EXISTS="000007";

    private String code;
    private String mesg;
    private Object data;
    
    private HttpServletResponse response;

    public ApiResult(){

    }
    
    public ApiResult(HttpServletResponse response) {
		this.response = response;
	}

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public void setPageData(Page<?> page) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("list", page.getList());
    	map.put("pageNo", page.getPageNo());
    	map.put("pageSize", page.getPageSize());
    	map.put("totalCount",page.getTotalCount());
    	map.put("totalPage",page.getTotalPage());
    	this.data = map;
    }

    public String getMesg() {
		return mesg;
	}

	public void setMesg(String mesg) {
		this.mesg = mesg;
	}

	public String getCode() {
        return code;
    }
    public void setCode(String code) {
    	// 根据执行结果设置网络状态码
        response.setStatus(HttpServletResponse.SC_OK);
		this.code = code;
    }



}
