//Take marks and print Grade using if-else (A/B/C/...)


import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks ");
        int marks = sc.nextInt();
        if(marks >90){
            System.out.println("you scored A grade ");
        }
        else if ( marks > 80 && marks <= 90){
            System.out.println( "you scored B grade");
        }
        else if (marks > 70 && marks <= 80){
            System.out.println( "you scored C grade");
        }
        sc.close();
    }


}
