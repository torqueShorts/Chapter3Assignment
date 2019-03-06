
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class FailingTest {

    private Failing failed;

    @Before
    public void setUp() throws Exception {
        failed = new Failing();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addMethod() {
        try {
            assertEquals("The sum of 3 and 2 is 5.", 5, failed.addMethod(Integer.parseInt("three"), 2));
        }catch(NumberFormatException e){
            fail("The program has failed due to incorrect input type");
        }
    }
}
