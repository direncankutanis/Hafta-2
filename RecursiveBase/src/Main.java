import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Taban değerini giriniz: ");
        int base = scan.nextInt();

        System.out.println("Üs değerini giriniz: ");
        int exponent = scan.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuç= " + result);
    }

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
