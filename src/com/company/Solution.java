package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.io.Serializable;

public class Solution {
    public static void main(String[] args) {
        int myInt = 5;
   if(myInt<10) {
       System.out.println("так, вірно");
   } else if (myInt > 20){
       System.out.println("ні, не вірно");
   } else {
       System.out.println("жоден з попередніх не вірний");
   }
    }
}
