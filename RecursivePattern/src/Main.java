import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int inpNum;

        do {
            System.out.println("Bir sayı giriniz: ");
            inpNum = inp.nextInt();
            if (inpNum <= 0) {
                System.out.println("Lütfen pozitif sayı giriniz");
            }
        } while (inpNum <= 0);

        patternDesign(inpNum);
    }

    static int patternDesign(int initialNum) {
        if (initialNum <= 0) { // Negatif ise döngü durur
            return 0;
        } else {
            // Çıkarma islemi
            initialNum -= 5;
            System.out.print(initialNum + " ");
            if (initialNum <= 0) { // 0'dan küçük olunca toplamaya baslar
                initialNum += 5;
                System.out.print(initialNum + " ");

            } else {
                return patternDesign(initialNum);
            }


        }
        return 0;


    }
}