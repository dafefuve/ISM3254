/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author dafefuve
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userIn1,userIn2;

        System.out.print("Enter a 2-digit number: ");
        userIn1 = input.nextInt();
        System.out.println("Sum of digits = " + (userIn1 % 10 + userIn1 / 10) );
        
        System.out.print("Enter a number between 97 and 122: ");
        userIn2 = input.nextInt();
        userIn2 -= 32;
        char character = (char)userIn2;
        System.out.println("Lower to Upper = " + (character));
       
        // TODO code application logic here
    }
    
}
