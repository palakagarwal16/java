import java.util.Scanner;

//Count digits of a number.
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int m=0;
        int count = 0;
        while(num>0){
            m = num%10;
            num = num/10;
            count++;
        }
        System.out.println(count);

    }
}
