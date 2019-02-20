package com.stackroute.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchNameTest {
    SearchName searchName;
    @Before
    public void setUp() throws Exception {
        searchName=new SearchName();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isHarryHere() {
        boolean expected=true;
        boolean actual=searchName.isHarryHere("This is harry.");
        assertEquals(expected,actual);

    }
    @Test
    public void isHarryHereFail() {
        boolean expected=false;
        boolean actual=searchName.isHarryHere("This is henry.");
        assertEquals(expected,actual);

    }
    @Test
    public void isHarryHereNotNull() {

        boolean actual=searchName.isHarryHere("This is henry.");
        assertNotNull(actual);

    }
}