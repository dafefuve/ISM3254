/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author dafefuve
 */
public class Assignment7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userIn1;
        String userIn2;

        System.out.print("Enter a positive integer number: ");
        userIn1 = input.nextInt();
        switch(userIn1 % 2){
            case 0 : System.out.println(userIn1 + "\nEven!");break;
            case 1 : System.out.println("Odd!");
        }
        
        System.out.print("Enter your area: ");
        userIn2 = input.next();
        switch(userIn2)
        {
            case "Gainesville" : System.out.print("Gainesville, ");
            case "FL" : System.out.println("FL"); break;
            default : System.out.println("Error!");   
        }
    }
    
}
