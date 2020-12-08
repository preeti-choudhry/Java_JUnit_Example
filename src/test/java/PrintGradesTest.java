/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Producer
 */
public class PrintGradesTest {
    
    public PrintGradesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testAssertPass() {
        PrintGrades pg = new PrintGrades();
        String result =pg.print(95);
        assertEquals("Incorrect Message was received", "You got an A!", result);
    }

    @Test
    public void testAssertFail() {
        PrintGrades pg = new PrintGrades();
        String result =pg.print(90);
        assertEquals("Incorrect Message was received", "You got an A!", result);
    }
    
}
