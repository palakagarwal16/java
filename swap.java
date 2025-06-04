//Swap two numbers using a temporary variable.
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter var1");
        int var1 = sc.nextInt();
        System.out.println(" Enter var2 ");
        int var2 = sc.nextInt();
        System.out.println( "value of v1 and v2 " + var1 + var2);
        int temp;
        temp = var2  ;
        var2 = var1 ;
        var1 = temp ;

        System.out.println( "value of v1 and v2 " + var1 + var2);


    }
}
