
import org.junit.runner.RunWith;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;


public class ObjectEqualityTest {



    @org.junit.Test
    public void testAddMethod2()
    {
        ObjectEquality a = new ObjectEquality();
        ObjectEquality b = new ObjectEquality();

        Assert.assertEquals(a,b);


    }
}
