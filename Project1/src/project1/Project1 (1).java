/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author dafefuve
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userId,idFirstFour, idLastFour;
        String userIn2;

        System.out.println("\"Fuentes, Daniel\"\nUFID:9812-4813");

        System.out.print("Enter UFID with no dash: ");
        userId = input.nextInt();
        idFirstFour = ((userId/10000));
        idLastFour = userId%10000;

        if((idFirstFour%2 == 0) && (idLastFour%2 == 0)){
            System.out.println("Difference: " + ((idFirstFour>=idLastFour)? idFirstFour-idLastFour : idLastFour-idFirstFour));
        }
        else if((idFirstFour%2 == 0) ^ (idLastFour%2 == 0) ) {//exclusive OR operator '^' one or the other one but not both
            System.out.println("Average: " + ((idFirstFour + idLastFour)/2.0) );
        }
        else{
            System.out.print("Enter your Name: ");
            userIn2 = input.next();
            switch (userIn2){
                case "Fuentes" : System.out.print( "Fuentes, ");
                case "Daniel" : System.out.println("Daniel");break;
                default: System.out.println("Error!");
            }
        }
    }
    
}
