/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.Scanner;

/**
 *
 * @author dafefuve
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fName;
        int first4ID, last4ID;
        Scanner input = new Scanner(System.in);
        System.out.println("\"My Fisrt Name and My UFID#\"");
        System.out.print("Enter your first name: ");
        fName = input.nextLine();
        System.out.print("Enter the first four digits of your UFID: " );
        first4ID = input.nextInt();
        System.out.print("Enter the last four digits of your UFID: " );
        last4ID = input.nextInt();
        
        System.out.println(fName + "\n" + (first4ID + last4ID));
        
       
    }
    
}
