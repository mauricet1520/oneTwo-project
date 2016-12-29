package com.tiy.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crci1 on 12/28/2016.
 */
public class OneTwoTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAvoidingString(){
        OneTwo objectOfOneTwo = new OneTwo();
        String holder = objectOfOneTwo.oneTwoMethod("ab");
        assertEquals("", holder);
    }

    @Test
    public void testMoveLetter(){
        OneTwo objectOfOneTwo = new OneTwo();
        String holder = objectOfOneTwo.oneTwoMethod("abc");

        assertEquals("bca", holder);
    }

    @Test
    public void testLargerWordMoreThan4(){

        OneTwo objectOfOneTwo = new OneTwo();
        String holder = objectOfOneTwo.oneTwoMethod("abcdef");

        assertEquals("bcaefd", holder);

    }

    @Test
    public void testLargerWords(){

        OneTwo objectOfOneTwo = new OneTwo();
        String holder = objectOfOneTwo.oneTwoMethod("1234567890");

        assertEquals("231564897", holder);

    }



}
