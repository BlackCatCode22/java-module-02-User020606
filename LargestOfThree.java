//LargestOfThree.java
// vM 8/19/25

// References:
// This is what I used to learn user input
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        System.out.println("\n What is the largest number num1, num2, or num3\n ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Please enter a whole number for num1: ");
        int num1 = 0;
        num1 = scanner.nextInt();
        System.out.print("\n Please enter a whole number for num2: ");
        int num2 = 0;
        num2 = scanner.nextInt();
        int num3 = 0;
        System.out.print("\n Please enter a whole number for num3: ");
        num3 = scanner.nextInt();


        if ( num1 > num2 ) {
            if ( num1 > num3 ) {
                System.out.println(" The biggest number is num1 which was " + num1);
            }else{
                System.out.println(" The biggest number is num3 which was " + num3);
            }
        }

        else if ( num2 > num3 ) {
            System.out.println(" The biggest number is num2 which was " + num2);
        }else {
            System.out.println(" The biggest number is num3 which was " + num3);
        }
    }
}