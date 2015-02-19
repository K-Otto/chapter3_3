package za.ac.cput.karl;

import Config.Config;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/18.
 */
public class CalcTest {
    private CalculatorInterface calc1;


    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        calc1 = (CalculatorInterface)ctx.getBean("calc1");

    }

    @Test
    public void testName() throws Exception {
        int result = calc1.add(5,5);
        Assert.assertEquals(result,10);

    }

    @After
    public void tearDown() throws Exception {


    }
}
