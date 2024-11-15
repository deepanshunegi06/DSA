// Prompt the user to enter an integer

// Read the integer from the console

// Check if the number is even and print the appropriate message
import java.util.Scanner;

public class ques1 {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        if (isEven(num)) {
            // isEven returned true
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }

}

