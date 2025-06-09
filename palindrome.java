import java.util.Scanner;

//Check if a number is a palindrome.
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int m=0;
        int ans = 0;
        int original = num;
        while(num>0) {
            m = num % 10;
            num = num / 10;
            ans = (ans * 10 )+ m;
        }
        if (ans==original){
            System.out.println("YAY!! Palindrome ");
        }
        else {
        System.out.println("NOPES!! next time");
        }
    }
}
