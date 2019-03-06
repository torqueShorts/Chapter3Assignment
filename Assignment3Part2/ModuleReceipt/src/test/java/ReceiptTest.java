import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiptTest {

    Receipt tot;

    @Before
    public void setUp() throws Exception {

        tot = new Receipt();


    }

    @Test
    public void total() {

        tot.total(100, 200);

        try {
            assertEquals("The total amount due should be R300", 300, tot.total(100, 200));
        }catch(NumberFormatException e){
            fail("The program has failed due to incorrect input type");
        }




    }
}