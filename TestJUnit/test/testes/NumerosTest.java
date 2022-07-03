/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago Quevedo
 */
public class NumerosTest {
    private Numeros n;
    public NumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         n = new Numeros();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of numeroPar method, of class Numeros.
     */
    @Test
    public void testNumeroPar() {
        System.out.println("numeroPar");
        
        assertEquals(true, n.numeroPar(8));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of areQ method, of class Numeros.
     */
    @Test
    public void testAreQ() {
        System.out.println("areQ");
        
        assertEquals(100, n.areQ(10));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of numeroDivisivel method, of class Numeros.
     */
    @Test
    public void testNumeroDivisivel() {
        System.out.println("numeroDivisivel");
        
        assertTrue(n.numeroDivisivel(4, 2));
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test 
    public void testSomaNumeros(){
        System.out.println("somaNumeros");
        
        assertEquals(4, n.somaValores(2, 2));
    }
    
}
