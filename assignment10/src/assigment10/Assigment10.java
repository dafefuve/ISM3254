/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment10;

/**
 *
 * @author dafefuve
 */
public class Assigment10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int num1 = 10, num2 = 10, num3 = 15;

        System.out.println("smallest is " + smallest(num1, num2, num3));

        double num4 = 10.5;
        double num5 = 10.5;
        double num6 = 15.1;

        System.out.println("average is "+ average(num4,num5,num6));

    }
    public static int smallest(int i, int j, int k){
        int smallest = i;
        if( j < smallest )
        {
            smallest = j;
        }
        if( k < smallest )
        {
            smallest = k;
        }
        return smallest;
    }
    public static double average(double i, double j, double k){
        return (i+j+k)/3;
    }
    
}
