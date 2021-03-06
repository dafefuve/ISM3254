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
            String[] name = new String[5];
            char[] grade = new char[5];
            for(int i = 0; i < name.length;i++){
                double midterm, finalScore;
                System.out.print("Student " + (i + 1) + "\nEnter the student name: ");
                name[i] = input.next();
                System.out.print( "Enter the midterm score: ");
                midterm = input.nextDouble();
                System.out.print( "Enter the final score: ");
                finalScore = input.nextDouble();
                grade[i] = function( function( average( midterm, finalScore ), finalScore ) );
            }
            System.out.println("Name\tGrade");
            for (int i = 0; i < name.length; i+=2)
            {
                System.out.println(name[i] + "\t" + grade[i]);
            }

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
    public static double average(double num1,double num2){
        return (num1+num2)/2;
    }
    public static double function(double average, double finalScore){
        return average > finalScore ? average : finalScore;
    }
    public static char function(double score){
        if(score > 90)
            return 'A';
        else if(score > 80)
            return 'B';
        else if (score > 70)
            return 'C';
        else
            return 'F';
    }

}
