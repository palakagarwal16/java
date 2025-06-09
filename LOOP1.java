import java.util.Scanner;

//Print the table of a number using for loop.
public class LOOP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your number ");
        int num = sc.nextInt();
        System.out.println( "Table of %d" + num);
        for( int i =0 ; i<11 ; i++ ){
            System.out.println( num + " X " + i + " = " + (num*i) );
        }
    }
}
