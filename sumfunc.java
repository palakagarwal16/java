import java.util.Scanner;

public class sumfunc {

    // Function to calculate sum of digits
    static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // get last digit
            sum += digit;       // add to sum
            n = n / 10;         // remove last digit
        }

        return sum;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = sumOfDigits(number);
        System.out.println("Sum of digits: " + result);
    }
}

