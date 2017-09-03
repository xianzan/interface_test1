package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import util.HttpUtils;
import util.PackHeaders;
import util.PackJson;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class home {
    @RequestMapping(path={"/index"})
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping(path = {"/test"})
    public String test(){
        return "test";
    }
    @RequestMapping(path = {"/upfile"})
    public String upfile(){
        return "upfile";
    }

    /**
     * 客户端点击接口时获取默认的POST请求参数
     */
    @RequestMapping(path = {"/getpostparam"},method = RequestMethod.POST)
    @ResponseBody
    public String getPostParam(HttpServletRequest request,@RequestParam("url") String url){
        String result = null;
        System.out.println("客户端请求的URL地址为："+url);
        //根据url组装POST参数发送个客户端
        switch (url){
            case "/attribute/document/get":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setAttributeDocumentGet();
                System.out.println(result);
                return result;
            case "/attribute/document/put":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setAttributeDocumentPut();
                System.out.println(result);
                return result;
            case "/controls/{serial_number}/configs/date_format":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setContr_config_date_format();
                System.out.println(result);
                return result;
            case "/controls/{serial_number}/configs/time_format":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setContr_config_time_format();
                System.out.println(result);
                return result;
            case "/controls/{serial_number}/configs/timeout_to_sleep":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setContr_config_timeout_to_sleep();
                System.out.println(result);
                return result;
            case "/controls/{serial_number}/log":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setContr_log();
                System.out.println(result);
                return result;
            case "/controls/{serial_number}/register_wifi_accesspoint":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setContr_register_wifi_accesspoint();
                System.out.println(result);
                return result;
            case "/controls/{serial_number}/update_firmware":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setContr_update_firmware();
                System.out.println(result);
                return result;
            case "/device/contents":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDevice_contents();
                System.out.println(result);
                return result;
            case "/device/indicate":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDevice_indicate();
                System.out.println(result);
                return result;
            case "/device/screen_shot":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDevice_screen_shot();
                System.out.println(result);
                return result;
            case "/device/unindicate":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDevice_undicate();
                System.out.println(result);
                return result;
            case "/document/delete":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDocument_delete();
                System.out.println(result);
                return result;
            case "/document/get":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDocument_get();
                System.out.println(result);
                return result;
            case "/document/info":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDocument_Info();
                System.out.println(result);
                return result;
            case "/document/list":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDocument_list();
                System.out.println(result);
                return result;
            case "/document/open":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDocument_open();
                System.out.println(result);
                return result;
            case "/document/rename":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setDocument_rename();
                System.out.println(result);
                return result;
            case "/folder/create":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setFolder_create();
                System.out.println(result);
                return result;
            case "/folder/delete":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setFolder_delete();
                System.out.println(result);
                return result;
            case "/folder/rename":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setFolder_rename();
                System.out.println(result);
                return result;
            case "/manage/devices":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setPOST_manage_devices();
                System.out.println(result);
                return result;
            case "/manage/license":
                System.out.println("服务器收到的URL地址为："+url);
                result = PackJson.setPost_manage_license();
                System.out.println(result);
                return result;
        }
        return "";
    }

    @RequestMapping(path = {"/interface"},method = RequestMethod.GET)
    @ResponseBody
    public String getInterface(HttpServletRequest request, @RequestParam("url") String url){
        System.out.println("url:"+url+"\n"+"request.getMethod():"+request.getMethod());
        //发生Httpget请求
        String result = HttpUtils.sendHttpGetRequest(url);

        //组装requestHeader参数
        Map<String, String> map = new HashMap<>();
        map = PackHeaders.getRequestHeader(request);

        //组装json格式字符串
        String requestHeader = PackJson.setjson(map);

        //以key-value的方式组装结果，方便前端读取数据
        String resJson = "{\"result\":"+result +",\"requestHeader\":"+requestHeader+"}";
        System.out.println("result1:"+requestHeader);
        return resJson;
    }

}
