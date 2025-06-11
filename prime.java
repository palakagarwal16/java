import java.util.Scanner;

public class prime {
    static void Prime(int n){
        boolean isPrime = true; // ✅ define it inside the method

            if(n<=1)
            {
                isPrime = false;
            }
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }


                if (isPrime) {
                    System.out.println("NUM is prime");
                } else {
                    System.out.println("Not Prime");
                }
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int a = sc.nextInt();
        prime.Prime(a);
    }
}
