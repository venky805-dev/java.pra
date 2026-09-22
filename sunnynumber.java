import java.util.Scanner;
public class sunnynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n + 1;
        int root = (int) Math.sqrt(num);
        if (root * root == num) {
            System.out.println( " sunny number");
        } else {
            System.out.println("  not a sunny number");
        }
        sc.close();
    }
}
