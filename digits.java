import java.util.Scanner;

//Print number of digits that divide the number (e.g., 1012 → output 3)
public class digits {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();
        int original = num;  // Keep a copy of the original number
        int count = 0;

        while (num > 0) {
            int digit = num % 10;  // Extract last digit
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            num = num / 10;  // Remove last digit
        }
        }
    }

