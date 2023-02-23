/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samuel
 */
public class OperarTest {
    
    public OperarTest() {
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
     * Test of Operar method, of class Operar.
     */
    @Test
    public void testOperar() {
        System.out.println("Operar");
        String[] cadena = {"2","4","+"};
        double expResult = 6;
        double result = Operar.Operar(cadena);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class Operar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Operar.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
