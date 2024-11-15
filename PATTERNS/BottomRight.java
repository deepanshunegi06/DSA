public class BottomRight {
    public static void main(String[] args) {
        int n = 50;
        // Outer loop is for row
        for (int row = 1; row <= n; row++) {
             //Space
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            //Stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
