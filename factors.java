
import java.util.Scanner;

public class factors{

            // Function to print all factors of a number
            static void printFactors(int n) {
                System.out.println("Factors of " + n + " are:");
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            }

            // Main method to test
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                printFactors(number);
            }

}
