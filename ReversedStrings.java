
        // MaddnessWithMethods.java
        // vM 8/28/25
        // Refernces: w3schools: Reverse a string


public class ReversedStrings {
    public static void main(String[] args) {

        String originalStr = "Hello world";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);




    }
}