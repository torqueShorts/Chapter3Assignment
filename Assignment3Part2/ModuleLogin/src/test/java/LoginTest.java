import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LoginTest {

    ArrayList <Login> array = new ArrayList<>();




    Login user;

    @Before
    public void setUp() throws Exception {

        user = new Login("Chad","FrenchFries");
        array.add(new Login("Chad","FrenchFries"));
        array.add(new Login("Jack","Black"));
        array.add(new Login("Kevin","Rudolph"));
    }

    String userNameID;

    @Test
    public void loginDetailsTest() {


            for (int i = 0; i < array.size(); i++) {
                if (user == array.get(i)) {
                    userNameID = array.get(i).userName;


                    break;
                }
            }
        }

}