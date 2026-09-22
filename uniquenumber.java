import java.util.Scanner;
public class uniquenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       

        boolean Unique = true;
       
           for( int i = 0; i <= 9; i ++) {
            int count = 0;
            int Temp = n;

            while (Temp > 0) {
                if (Temp % 10 == i) {
                    count++;
                }
                Temp = Temp / 10;
            }
            if (count > 1) {
                Unique = false;
                break;
            }
        }
        if (Unique) {
            System.out.println("Unique number.");
        } else {
            System.out.println("Not a unique number.");
        }
        sc.close();
    }
}
