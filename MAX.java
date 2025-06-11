//Write a function to find the maximum of three numbers.
public class MAX {

        static void  max(int a,int b,int c){
        if(a>b&&a>c){
            System.out.println("A is maximum");
        } else if (b>a&& b>c) {
            System.out.println("B is maximum");
        }
        else{
            System.out.println("C is maximum ");
        }
    }
    public static void main(String[] args) {
    MAX.max( 10 , 12, 56);
    }
}
