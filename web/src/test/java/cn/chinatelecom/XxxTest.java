package cn.chinatelecom;

import cn.chinatelecom.core.Sayhello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * springboot 测试例子
 * Created by cxu on 2017/2/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = XxxTest.class)
@SpringBootApplication
//@TestPropertySource("classpath:db.properties")
public class XxxTest {
    @Autowired
    protected Sayhello sayhello; //应该是test

    /**
     *
     */
    @Test
    public void test() {
        String sayString = sayhello.sayhello();
        assertEquals("hello test", sayString);
    }

}
