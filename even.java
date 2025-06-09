import java.util.Scanner;

//Print all even numbers from 1 to N.
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select your num ");
        int num = sc.nextInt();
        for( int i = 1 ; i<num ; i++){
            if (i%2 ==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}