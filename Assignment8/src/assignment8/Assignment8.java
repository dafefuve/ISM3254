/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment8;
import java.util.Scanner;

/**
 *
 * @author dafefuve
 */
public class Assignment8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstDay, days;
        String month;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month: ");
        month = input.next();
        System.out.print("Enter the number of days in the month: ");
        days = input.nextInt();
        System.out.print("Enter 1st day of the month (1 = Sunday, 7 = Saturday): ");
        firstDay = input.nextInt();

        System.out.println(month);
        System.out.println("Sun\tMon\tTu\tWed\tThu\tFri\tSat\t");
        int space = 1;
        while(space < firstDay ){
            System.out.print("\t");
            space++;
        }
        int day = 1;

        while (day <= days){
            System.out.print(day+"\t");
            if (space++%7 == 0){
                System.out.println("");
            }
            day++;
        }
        System.out.println("");
    }
    
}
