/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitTask;

/**
 *
 * @author COMMAND'17
 */
public class Reverse_2 {
    public String methodReverse_2(String original){
        String hasil;
        String reverse = "";
        int length = original.length();
        for(int i=length-1; i>=0; i--)
            reverse = reverse + original.charAt(i);
        
        hasil = "The reverse of "+original+" is "+reverse;
        return hasil;
    }
}
