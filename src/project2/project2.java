package project2;
import java.util.Scanner;

public class project2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the application (1=Calendar, 2=Grade): ");
        int user_choice = input.nextInt();
        if (user_choice == 1){
            int firstDay, days;
            String month;
            System.out.print("Enter the month: ");
            month = input.next();
            System.out.print("Enter the number of days in the month: ");
            days = input.nextInt();
            System.out.print("Enter 1st day of the month (1 = Sunday, 7 = Saturday): ");
            firstDay = input.nextInt();
            calendar(month, days, firstDay);
        }
        else if (user_choice == 2){

        }
        else{
            System.out.println("Error!");
        }
    }
    public static void calendar( String month, int days, int firstDay)
    {
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
