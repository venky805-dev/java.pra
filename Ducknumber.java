import java.util.Scanner;
public class Ducknumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int temp = n;
        boolean Duck = false;
        while (temp > 0) {
            if (temp % 10 == 0) {
                Duck = true;
                break;
            }
            temp = temp / 10;
        }
        if (Duck) {
            System.out.println( " Duck number.");
        } else {
            System.out.println(" not a Duck number.");
        }
    sc.close();
    }
}
