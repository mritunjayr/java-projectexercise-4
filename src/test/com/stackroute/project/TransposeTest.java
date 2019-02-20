package com.stackroute.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    Transpose transpose;
    @Before
    public void setUp() throws Exception {
        transpose=new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        transpose=null;
    }

    @Test
    public void transpose() {
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String actual=transpose.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,actual);
    }

    @Test
    public void transposeNull() {

        String actual=transpose.transpose(null);
        assertNull(actual);
    }
    @Test
    public void transposeNotNull() {

        String actual=transpose.transpose("a quick brown fox jumps over the lazy dog");
        assertNotNull(actual);
    }
}