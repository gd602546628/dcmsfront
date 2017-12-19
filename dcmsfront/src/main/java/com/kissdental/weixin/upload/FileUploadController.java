package com.kissdental.weixin.upload;

import com.kissdental.weixin.utils.OperationFileUtil;
import com.kissdental.weixin.utils.ReadPropertesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dartagnan on 17/8/1.
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    @RequestMapping("/upload")
    public String uploadPage(){
        return "upload";
    }

    @RequestMapping("/upload2.do")
    public @ResponseBody String upload2( HttpServletRequest request, ModelMap model) {
        System.out.println("开始");
        try {
            String path = ReadPropertesUtil.getValue("filePath");
            OperationFileUtil.multiFileUpload(request,path);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "result";
    }
}
