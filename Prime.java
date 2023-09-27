import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Prime {
 
    static int x = 0;
    static int n = 0;

    public static void nuInput () {
        Scanner input = new Scanner (System.in);
       

        while ( x >= n ) {
            System.out.print("Erste Zahl bitte: ");
            x = input.nextInt();

            System.out.print("Letzte Zahl bitte: ");
            n = input.nextInt()+1;
        }

                
        System.out.println("\n" + x + " - " + (n-1) + "\n");
    }

    public static void main (String[] args) {
        nuInput();
        

        for (int i = x;  i < n; i++) {
            Vector<Integer> vecPrime = new Vector<>();
        }
    }
}


