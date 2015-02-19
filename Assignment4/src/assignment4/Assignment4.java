/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;
import java.util.Scanner;

/**
 *
 * @author dafefuve
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float userIn;
        int number, quotien, remainder;
        String msg = "Welcome to Java!";
        System.out.println("Msg is " + msg);
        System.out.print("Enter a floating-point numer: ");
        userIn = input.nextFloat();
        
        number = (int)userIn;
        quotien = number / 2;
        remainder = number % 2;
        System.out.println("Quotien is: " + quotien + "\nRemainder is: " + remainder);
    }    
}
