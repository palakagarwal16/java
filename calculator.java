import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 and num2 ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println( "add = 1 ");
        System.out.println( "sub = 2 ");
        System.out.println( "mul = 3");
        System.out.println("div = 4");
        System.out.println( "choose your operation ");
        int select = sc.nextInt();
        switch(select){
            case 1 :
                System.out.println("your answer is " + (num1 + num2));
                break;
            case 2 :
                System.out.println("your answer is " + (num1 - num2));
                break ;
            case 3 :
                System.out.println("your answer is " + (num1 * num2));
                break ;
            case 4 :
                System.out.println("your answer is " + (num1%num2));
                break;
            default:
                System.out.println("INVALID USER INPUT");
        }

    }
}
