package cn.chinatelecom.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cxu on 2017/2/27.
 */
@Controller
public class MyController {

    @Autowired
    private Mybean mybean;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return mybean.getName();
    }
}
