import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        // variable defined
        System.out.println("Please enter a number: ");
        int num = inp.nextInt();

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        // list sorting
        Arrays.sort(list);
        // list check
        System.out.println(Arrays.toString(list));
        // determined min and max value
        int min = list[0];
        int max = list[list.length - 1];
        // condition defined
        for (int i : list) {
            if (i < num && i > min) {
                min = i;
            }
            if (i > num && i < max) {
                max = i;
                if ((num - min) > (max - num)) {
                    System.out.println("nearest number to giving number is  " + max);
                } else if((num - min) < (max - num)) {
                    System.out.println("nearest number to giving number is  " + max);
                }else {
                    System.out.println("nearest number to giving number is both  " + max + " " + min);
                }
            }

        }
    }
}