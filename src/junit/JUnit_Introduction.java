/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author COMMAND'17
 */
public class JUnit_Introduction {

    public double addDouble(double n1, double n2){
         return n1+n2;
     }
    public String addString(String n1, String n2){
         return n1+n2;
     }
    public int addInt(int n1, int n2){
         return n1+n2;
     }
    public boolean isOdd(int number){
        if(number %2 != 0){
            System.out.println(number+" is Odd Number");
            return true;
        }
        return false;
    }
    public boolean isEven(int number){
        if(number %2 == 0){
            System.out.println(number+" is Even Number");
            return true;
        }
        return false;
    }
}
