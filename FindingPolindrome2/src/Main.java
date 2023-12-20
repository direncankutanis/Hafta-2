import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean isPalindrome(int number) { // Metod olusturma

        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {

            lastNumber = temp % 10;

            reverseNumber = (reverseNumber * 10) + lastNumber;

            temp /= 10;

        }
        System.out.println("Number is: " + number);
        System.out.println("Reverse number is: " + reverseNumber);
        if (number == reverseNumber) {
            System.out.println("This number is defined as polindrome number");
            return true;
        } else {
            System.out.println("This number can not defined as polindrome number");
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(233));

    }
}