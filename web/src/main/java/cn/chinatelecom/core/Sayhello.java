package cn.chinatelecom.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by cxu on 2017/2/28.
 */
@Component
public class Sayhello {
    @Autowired
    private Mybean mybean;

    public String sayhello() {
        return "hello " + mybean.getName();
    }
}
