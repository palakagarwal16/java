public class Fpalindrome {

    static void palindrome( int num ){
        int m=0;
        int ans = 0;
        int original = num;
        while(num>0) {
            m = num % 10; // find remainder then digits remaining and those used for next iteration .
            num = num / 10;
            ans = (ans * 10 )+ m;
        }
        if (ans==original){
            System.out.println("YAY!! Palindrome ");
        }
        else {
            System.out.println("NOPES!! next time");
        }
    }

    public static void main(String[] args) {
        palindrome(232);
    }
    }

