package com.stackroute.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCountTest {
    CharacterCount characterCount;
    @Before
    public void setUp() throws Exception {
        characterCount=new CharacterCount();
    }

    @After
    public void tearDown() throws Exception {
        characterCount=null;
    }


    @Test
    public void characterCount() {
        int expected=10;
        int actual=characterCount.characterCount("Java is java again java again",'a');
        assertEquals(expected,actual);
    }

    @Test
    public void characterCountFailure() {
        int expected=10;
        int actual=characterCount.characterCount("Java is java again java again",'J');
        assertNotEquals(expected,actual);
    }

    @Test
    public void characterCountNotNull() {
        int actual=characterCount.characterCount("Java is java again java again",'J');
        assertNotNull(actual);
    }

}