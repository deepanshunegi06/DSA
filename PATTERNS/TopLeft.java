public class TopLeft {
    public static void main(String[] args) {
        int n = 50;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; row + col <= n + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
