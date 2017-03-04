package cn.chinatelecom.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by cxu on 2017/2/27.
 */
@Component
public class Mybean {
    @Value("${name}")
    private String name;
    @Value("${server.context-path}")
    private String contentPath;

    public String getName() {
        return name + contentPath;
    }

    public void setName(String name) {
        this.name = name;
    }
}
