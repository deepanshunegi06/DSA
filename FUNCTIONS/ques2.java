import java.util.Scanner;

public class ques2{


    public static boolean checkPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;

        }
        if (n == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();

        if (checkPalindrome(n)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("No ,It's not an Palindrome");
        }
    }

}
