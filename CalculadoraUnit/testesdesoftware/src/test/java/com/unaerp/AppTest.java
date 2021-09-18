package com.unaerp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    public AppTest(){

    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass(){

    }

    @Before
    public void setUp(){

    }

    @Test
    public void testSomar(){
        System.out.println("Somar");
        int n1 = 0;
        int n2 = 0;
        Calculadora calc = new Calculadora();

        double expectedResult = 0.0;
        double result = calc.somar(n1,n2);
        assertEquals(expectedResult, result, 0.001);
        //fail("O test case é um protótipo");
    }
}
