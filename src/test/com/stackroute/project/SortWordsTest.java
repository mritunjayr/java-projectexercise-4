package com.stackroute.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortWordsTest {

    SortWords sortWords;
    @Before
    public void setUp() throws Exception {
        sortWords=new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        sortWords=null;
    }

    @Test
    public void sortWordsInParagraph() {
        String []expected="A, A, Though, a, a, a, an, any, are, by, consists, dealing, discourse, expected, formal, idea., in, is, language, longer, more, not, of, of, of, of, one, or, or, organize, paragraph, paragraph, paragraphs, part, particular, point, prose, required, self-contained, sentences., syntax, the, to, unit, used, usually, with, writing, writing".split("[\\s,]+");
        String []actual=sortWords.sortWordsInParagraph("A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea. A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal writing, used to organize longer prose");
        assertArrayEquals(expected,actual);
    }
    @Test
    public void sortWordsInParagraphNull() {

        String []actual=sortWords.sortWordsInParagraph(null);
        assertNull(actual);
    }

    @Test
    public void sortWordsInParagraphNotNull() {

        String []actual=sortWords.sortWordsInParagraph("A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea. A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal writing, used to organize longer prose");
        assertNotNull(actual);
    }
}