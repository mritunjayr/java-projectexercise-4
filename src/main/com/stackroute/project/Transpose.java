//4. Write a program to transpose the given string.
//        Input String : a quick brown fox jumps over the lazy dog
//        Output String: a kciuq nworb xof spmuj revo eht yzal god
package com.stackroute.project;

public class Transpose {
    public String transpose(String input){
        if(input==null){
            return null;
        }
        StringBuffer output=new StringBuffer("");

        for(String string:input.split(" ")){
            StringBuffer value=new StringBuffer(string);
            value.reverse();
            output.append(value).append(" ");
        }

        return output.substring(0,output.length()-1);

    }
}
