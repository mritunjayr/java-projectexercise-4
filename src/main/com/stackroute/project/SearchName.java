//5. Write a program with the implementation of Regular Expression to find the presence of the name
//        Harry in a string.
//        Input: This is Harry.
//        Output: Is Harry here ? true
//        Input : This is Henry.
//        Output: Is Harry here ? False
package com.stackroute.project;

public class SearchName {
    public boolean isHarryHere(String input){
        return input.matches("(?i).*Harry.*");
    }
}
