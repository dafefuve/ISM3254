/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testMethod;

/**
 *
 * @author dafefuve
 */
public class TestMethod {
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 10;
        int num3 = 15;
        smallest(num1,num2,num3);
        double num4 = 10.5;
        double num5 = 10.5;
        double num6 = 15.1;
        average(num4,num5,num6);
        System.out.println("The maximum of 3 and 8 is " + function(3, 8));
        System.out.println("The average of 3.0 and 8.0 is " + function(3.0, 8.0));
        System.out.println("The minimum of 3, 8, and 10 is " + function(3, 8, 10));
        System.out.println("The average of 3, 8, 10 and 12 is " + function(3, 8, 10, 12));

    }
    public static void smallest(int i, int j, int k){
        int smallest = i;
        if( j < smallest )
        {
            smallest = j;
        }
        if( k < smallest )
        {
            smallest = k;
        }
        System.out.println("smallest is " + smallest);

    }
    public static void average(double i, double j, double k){
        System.out.println("average is "+ (i+j+k)/3);
    }
    public static int function(int num1, int num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    public static int function(int num1, int num2, int num3){
        int min = num1;
        if( num2 < min){
            min = num2;
        }
        if( num3 < min){
            min = num3;
        }
        return min;
    }
    public static double function(double num1, double num2){
        return (num1 + num2) / 2.0;

    }
    public static double function(int num1, int num2, int num3, int num4){
        return (num1 + num2 + num3 + num4) / 4.0;

    }
}
