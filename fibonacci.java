//Print Fibonacci series up to N terms.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ");
        int num = sc.nextInt();
        int next ;
        int first = 0;
        int sec = 2 ;
        for (int i = 0; i < num; i++) {
            System.out.print( first + " " );
            next  = first + sec  ;
            first = sec ;
            sec = next ;
        }
    }

}
