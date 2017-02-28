package cn.chinatelecom.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cxu on 2017/2/28.
 */
@Controller
public class HelloController {

    @Autowired
    private Sayhello sayhello;

    @RequestMapping("/webhello")
    @ResponseBody
    public String hello() {
        return sayhello.sayhello();
    }

}
