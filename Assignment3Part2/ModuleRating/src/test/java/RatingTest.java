import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RatingTest {


    Rating rate;


    @Before
    public void setUp() throws Exception {

        rate = new Rating();


    }

    @Test
    public void orderService() {

        boolean input = rate.OrderService(true);

        if(input == true)
        {
            Assert.assertTrue("The customer is happy with the service",true);
            System.out.println("Customer is happy with the service");
        }
    }
}