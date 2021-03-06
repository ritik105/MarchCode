import java.util.Scanner;

public class Ritik_Kumar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n = scan.nextInt();
        System.out.println("Enter value of m ");
        int m = scan.nextInt();

        if (n < m && n > 0 && m > 0) {
            System.out.println("Number between n and m are ");
            for (int i = n; i <= m; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            System.out.println("Enter positve value of n & m and n should be less than m");

        }


    }
}
