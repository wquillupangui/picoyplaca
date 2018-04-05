/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Washington
 */
public class PredictorTest {
    
    public PredictorTest() {
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
     * Test of initRestrictions method, of class Predictor.
     */
    @Test
    public void testInitRestrictions() {
        System.out.println("initRestrictions");
        Predictor instance = new Predictor();
        instance.initRestrictions();
        assertEquals(10, instance.getLstRestriction().size());
    }

    /**
     * Test of checkPlate method, of class Predictor.
     */
    @Test
    public void testCheckPlate() {
        System.out.println("checkPlate");
        String strPlate = "PPA9705";
        Predictor instance = new Predictor();
        String expResult = "Not Ride";
        instance.setLdNow(LocalDate.parse("2018-04-04"));
        instance.setLtNow(LocalTime.parse("19:00"));
        String result = instance.checkPlate(strPlate);
        System.out.println("checkPlate : "+ result);
        assertEquals(expResult, result);

    }
    
}
