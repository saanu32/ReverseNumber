import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the number of test cases
            int t = scanner.nextInt();

            // Process each test case
            for (int i = 0; i < t; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                // Reverse the numbers
                int reverseA = reverseNumber(a);
                int reverseB = reverseNumber(b);

                // Calculate the sum and reverse it
                int reverseSum = reverseNumber(reverseA + reverseB);

                // Print the result
                System.out.println(reverseSum);
            }
        }

        public static int reverseNumber(int n) {
            int reversedN = 0;
            while (n > 0) {
                reversedN = (reversedN * 10) + (n % 10);
                n /= 10;
            }
            return reversedN;
        }
    }


