public class Pattern9{
    public static void main(String[] args) {

        int n = 5;

        for (int i = 2; i <= n + 1; i++) {

            // Left stars
            for (int j = 1; j <= n - i + 2; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= n - i + 2; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}