package cn.chinatelecom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by cxu on 2017/2/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = XxxTest.class)
@SpringBootApplication(scanBasePackages = {"", ""})
@TestPropertySource("classpath:db.properties")
public class PropertySourceTest extends XxxTest{

    @Test
    public void test() {
        String sayString = sayhello.sayhello();
        assertEquals("hello db", sayString);
    }
}
