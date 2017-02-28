package cn.chinatelecom.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by cxu on 2017/2/24.
 */
@SpringBootApplication
public class Application {
    /**
     * 1， classpath下的properties文件
     * 2，命令行
     * 3，外部的配置文件
     * 4，系统变量配置
     * 5，application-{}.properties
     *,6，jar外部的application.properties
     *,7，jar内部的application.properties
     *
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[]args) throws IOException, InterruptedException {
        SpringApplication.run(Application.class, args);//启动
    }
    /**
     * http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html
      几种方式：优先级依次降低,后面覆盖前面的
     1, 默认从classpath下（resources)里的application.properties里.
     如果要改变配置文件名字使用 --spring.config.name=xxxx, 那么会用 xxxx.properties
     2, --spring.profiles.active=xx
     3, java -Dname=yy
     4, --name=xx
     5, /config/application-{}.properties
     6, --spring.config.location=classpath:,classpath:/config,file:,file:config/
     7, @PropertySource
     */
}
