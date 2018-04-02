/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decrement;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author TAMU
 */
public class Decrement {
    
    public static int increment(int a){
        int b = 1;
        b = a + b;
        return b;
    }
    public static int decrement(int c){
        int d = 1;
        d = c - d;
        return d;
    }
   
    public static void main(String[] args) {
       NumberFormat inc = new DecimalFormat("000");
       NumberFormat dec = new DecimalFormat("00000");
       int i = -1;
       while (i<10){
           i = increment (i);
           System.out.println(inc.format(i));
       }
       int j = 11;
       while (j>0){
           j = decrement (j);
           System.out.print(dec.format(j) +" ");
       }
    }
    
}