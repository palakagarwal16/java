public class factorialwithloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your number  ");
        int num  = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <num; i++) {
         fact =  ((fact)*(i));
        }
            System.out.println(fact);
    }
}
