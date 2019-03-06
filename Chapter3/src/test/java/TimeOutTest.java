
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TimeOutTest {


    private TimeOut out;

    @Before
    public void setUp() throws Exception {

        out = new TimeOut();

    }

    @After
    public void tearDown() throws Exception {
    }


        @Test
                (timeout = 5000)
        public void timeTest() throws Exception
        {
            out.time(10);
        }

}
