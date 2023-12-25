import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = inp.nextInt();
        int[] arr = new int[size];

        // Element of Array
        int value;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of array: ");
            value = inp.nextInt();
            arr[i] = value;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}