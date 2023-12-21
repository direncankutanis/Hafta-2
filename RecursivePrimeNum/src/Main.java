import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int userNum = scan.nextInt();

        // Kontrol yapma
        if (isPrime(userNum, 2)) {
            System.out.println(userNum + " bir asal sayıdır.");
        } else {
            System.out.println(userNum + " bir asal sayı değildir.");
        }


    }

    static boolean isPrime(int num, int divisor) { // Fonksiyon tanimlandi
        if (num < 2) {
            return false;
        }
        if (num == divisor) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return isPrime(num, divisor + 1);


    }
}
