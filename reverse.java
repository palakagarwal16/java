import java.util.Scanner;

//reverse a num
public class reverse {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number ");
            int num = sc.nextInt();
            int m=0;
            int ans = 0;
            int count = 0;
            while(num>0){
                m = num%10;
                num = num/10;
                ans = ans*10+m;
            }
            System.out.println(ans);

        }
    }

