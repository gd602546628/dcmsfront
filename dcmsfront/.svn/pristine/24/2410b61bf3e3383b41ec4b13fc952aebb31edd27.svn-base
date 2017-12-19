package com.kissdental.weixin.utils;

import java.util.Properties;

/**
 * Created by dartagnan on 17/8/1.
 */
public class ReadPropertesUtil {

    public static String getValue(String key) throws Exception{
        Properties pps = new Properties();
        pps.load(ReadPropertesUtil.class.getClassLoader().getResourceAsStream("dcmsfront.properties"));
        String value = pps.getProperty(key);
        return value;
    }

    public static void main(String[] args) {
        try {
            String value = getValue("filePath");
            System.out.println(value);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
