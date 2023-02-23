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
public class RevisarTest {
    
    public RevisarTest() {
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
     * Test of Parentesis method, of class Revisar.
     */
    @Test
    public void testParentesis() {
        System.out.println("Parentesis");
        String cadena = "()(";
        Revisar instance = new Revisar();
        boolean expResult = false;
        boolean result = instance.Parentesis(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Validar method, of class Revisar.
     */
    @Test
    public void testValidar() {
        System.out.println("Validar");
        String cadena = "32l";
        Revisar instance = new Revisar();
        boolean expResult = false;
        boolean result = instance.Validar(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Arreglo method, of class Revisar.
     */
    @Test
    public void testArreglo() {
        System.out.println("Arreglo");
        String cadena = "hola45";
        String[] expResult = {"h","o","l","a","45"};
        String[] result = Revisar.Arreglo(cadena);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Cadena method, of class Revisar.
     */
    @Test
    public void testCadena() {
        System.out.println("Cadena");
        String[] arreglo = {"h","o","l","a"};
        String expResult = "hola";
        String result = Revisar.Cadena(arreglo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class Revisar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Revisar.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
