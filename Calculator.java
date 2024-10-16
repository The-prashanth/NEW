import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the operator");
            char op = ip.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter 2 numbers");
                int num1 = ip.nextInt();
                int num2 = ip.nextInt();
                int ans = 0;
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                System.out.println("the answer is " + ans);

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation");
            }
        }
    }
}