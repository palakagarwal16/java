import java.util.Scanner;

//Find if a number is even or odd.
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " enter your number ");
         int num = sc.nextInt();
         if(num%2 == 0){
             System.out.println( "Number is Even ");
         }
         else {
             System.out.println("Number is odd ");
         }

    }
}
