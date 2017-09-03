package util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 对request的headers封装，由于前端的key无法解析“-”符号，所以将key中的“-”去除改成驼峰命名的方式
 */
public class PackHeaders {
    public static Map<String,String> getRequestHeader(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            if(key.equalsIgnoreCase("accept-language")){
                String value = request.getHeader(key);
                key = "acceptLanguage";
                map.put(key, value);
            }else if(key.equalsIgnoreCase("x-requested-with")){
                String value = request.getHeader(key);
                key = "xRequestedWith";
                map.put(key, value);

            }else if(key.equalsIgnoreCase("accept-encoding")){
                String value = request.getHeader(key);
                key = "acceptEncoding";
                map.put(key, value);

            }else if(key.equalsIgnoreCase("user-agent")){
                String value = request.getHeader(key);
                key = "userAgent";
                map.put(key, value);

            }
            else {  String value = request.getHeader(key);
                map.put(key, value);}
        }
        return map;
    }

//    public static Map<String,String> getResponseHeader(HttpServletResponse response){
//        Map<String,String> map = new HashMap<>();
//        response.getHeaderNames();
//        return map;
//    }

}
