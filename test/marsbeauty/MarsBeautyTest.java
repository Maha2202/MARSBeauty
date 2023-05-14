package marsbeauty;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MarsBeautyTest {
    
    public MarsBeautyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of setNewPassword method, of class User.
     */
    @Test
    public void testSetNewPassword() {
        System.out.println("This method test the setting for the new password");
        String username = "Admin";
        String password = "Admin555";
        String copassword = "Admin555";
        User instance = new User();
        boolean result = instance.setNewPassword(username, password, copassword);
        assertTrue(result);
    }

    /**
     * Test of register method, of class User.
     */
    @Test
    public void testRegister() {
        System.out.println("This method test the registeration");
        String username = "Mars";
        String Fname = "Beauty";
        String Lname = "Company";
        String phone = "0512345678";
        String password = "Mars1234";
        String Copassword = "Mars1234";
        User instance = new User();
        User expResult = new User(username, Fname, Lname, phone, password, Copassword);
        User result = instance.register(username, Fname, Lname, phone, password, Copassword);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of Login method, of class User.
     */
    @Test
    public void testLogin() {
        System.out.println("This method test the login");
        String username = "Admin";
        String password = "Admin555";
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.Login(username, password);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of Total method, of class Cart.
     */
    @Test
    public void testTotal() {
        System.out.println("This method test the calculation total price");
        String P1 = "30SR";
        String P2 = "120SR";
        Cart instance = new Cart();
        String expResult = "150.0SR";
        String result = instance.Total(P1, P2);
        assertEquals(expResult, result);
    }
}
