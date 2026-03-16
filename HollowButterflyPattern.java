import java.util.Scanner;

public class HollowButterflyPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        /* -------- Upper Half -------- */
        for (int i = 1; i <= n; i++) {

            // Left side
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Middle space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Right side
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        /* -------- Lower Half -------- */
        for (int i = n; i >= 1; i--) {

            // Left side
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Middle space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Right side
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        sc.close();
    }
}4