public class Bottomleft {
    public static void main(String[] args) {
        int n = 5;
        // Outer loop
        for (int row = 1; row <= n; row++) {
            // Inner loop
            for (int col = 1; col <= n; col++) {
                if (row - col <= 0) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
