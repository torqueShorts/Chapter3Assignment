import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    Order userOrder;


    @Before
    public void setUp() throws Exception {

        userOrder = new Order();

    }

    @Test
    public void item() {

        String value = userOrder.item("Chocolate Cake");

        if(value == "Chocolate Cake")
        {
            System.out.println("Order successful");
        }



    }
}