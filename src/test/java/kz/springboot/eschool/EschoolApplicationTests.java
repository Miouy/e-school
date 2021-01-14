package kz.springboot.eschool;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@SpringBootTest
class EschoolApplicationTests {

    @Test
    void contextLoads() {
        Assert.assertEquals(2*2,2);
    }

}
