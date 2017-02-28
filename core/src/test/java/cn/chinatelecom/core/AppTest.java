package cn.chinatelecom.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by cxu on 2017/2/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppTest.class)
@SpringBootApplication
@TestPropertySource("classpath:application-mybeantest.properties")
public class AppTest {
    @Autowired
    private Mybean mybean;

    @Test
    public void test() {
        String name = mybean.getName();
        assertEquals("mybean-test", name);
    }

}
