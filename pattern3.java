public class pattern3 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            char ch = (char) ('A' + i - 1);  // trick to convert number to alphabet

            for (int j = 0; j < i; j++) {
                System.out.print(ch);
                
            }
            System.out.println();
            
        }
    }
}
