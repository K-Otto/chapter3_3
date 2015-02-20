package za.ac.cput.karl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.karl.Config.AppConfig;

/**
 * Created by student on 2015/02/20.
 */
public class ListAppTest {
    private ListApp listTests;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        listTests = (ListApp)ctx.getBean("calc");
        listTests.add2(0, "1");
        listTests.add2(1, "4");

        listTests.add1(0, "1");
        listTests.add1(1, "2");

        listTests.remove("2");
        listTests.remove1("4");
        listTests.remove("6");
        listTests.remove1("7");



    }

    @Test
    public void testAddRemove() throws Exception {

        Assert.assertEquals("[1]", listTests.view2());
        Assert.assertEquals("[1]",listTests.view() );
    }



    @After
    public void tearDown() throws Exception {


    }
}