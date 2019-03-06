import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class DisablingTest {

    private Disabling disable;


    @Before
    public void setUp() throws Exception {

        disable = new Disabling();


    }



    @Ignore("This test case has been ignored therefore disabled")
    @Test
    public void getSentence() {
        disable.ignoredSentence("It is completed");
    }


    @Test
    public void visibleSentence2() {

        disable.visibleSentence2("At least this one is completed");
    }
}
