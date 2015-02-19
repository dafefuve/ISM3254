package assignment9;
import java.util.Scanner;

/**
 *
 * @author dafefuve
 */
public class Assignment9 {

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
        int space;
        for(space = 1; space < firstDay; space++ ){
            System.out.print("\t");
        }


        for(int day = 1; day <= days; day++){
            System.out.print(day+"\t");
            if (space++%7 == 0){
                System.out.println("");
            }
        }
    }
}
