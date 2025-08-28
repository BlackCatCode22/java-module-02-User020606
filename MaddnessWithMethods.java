
        // MaddnessWithMethods.java
        // vM 8/28/25


import java.util.Scanner;

    public class MaddnessWithMethods {
        public static void main(String[] args) {

            int num1 = 0;
            int num2 = 0;
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter a second number: ");
            num2 = scanner.nextInt();
            int sum = num1 + num2;
            int rest = num1 - num2;
            System.out.println( " num1 + num2 is " + sum);
            System.out.println( " num1 - num2 is " + rest);
        }
}