
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class ObjectIdentityTest {

    private ObjectIdentity animalNum1;
    private ObjectIdentity animalNum2;


    @Before
    public void setUp() throws Exception
    {
        animalNum1 = new ObjectIdentity();
        animalNum1.ObjectIdentity("Cat", "Tom", 4);

        animalNum2 = new ObjectIdentity();
        animalNum1.ObjectIdentity("Cat", "Tom", 4);

    }

    @Test
    public void objectIdentity()
    {
        boolean decider = animalNum1 == animalNum2;

        if(decider == true)
        {
            System.out.println("Animals are identical");
        }

        else
        {
            System.out.println("Animals are not Identical");
        }

    }
}
