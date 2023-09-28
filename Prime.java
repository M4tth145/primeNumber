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
        Vector<Integer> vecPrime = new Vector<>();
        for (int i = x;  i < n; i++) {
            if (i < 0 ) {
                System.out.println("Failia! " + i + " ist unter 0.");
                System.exit(0);
            }
            //Sieb Des Erathostenes
            else if (i == 2) {vecPrime.add(i);}
            else if (i % 2 == 0) {}
            else if (i == 3) {vecPrime.add(i);}
            else if (i % 3 == 0) {}
            else if (i == 5) {vecPrime.add(i);}
            else if (i % 5 == 0) {}
            else if (i == 7) {vecPrime.add(i);}
            else if (i % 7 == 0) {}
            else {
                vecPrime.add(i);
            }
        }
        for (Integer element :vecPrime) {
        System.out.print(element + "\t");
        }
        System.out.println("\nMade by Mad Stonehenge");
    }
}
