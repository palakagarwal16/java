import java.util.Scanner;

//Sum of digits of a number
        public class sum {
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number ");
            int num = sc.nextInt();
            int m=0;
            int ans= 0;
            int count = 0;
            while(num>0){
                int r = num%10;
                num = num/10;
                ans = ans+r ;
            }
            System.out.println( ans);

        }
    }
