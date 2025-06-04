import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "enter your number ");
        int num1 = sc.nextInt();
        if(num1>0){
            System.out.println("Number is positive ");
        }
        else if(num1<0){
            System.out.println("Number is negative ");
        }
        else{
            System.out.println( "number is 0 ");
        }

    }
}