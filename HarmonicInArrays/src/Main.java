public class Main {
    public static void main(String[] args) {
        // Array has been defined
        int[] numbers = {1,2,3,4,5};
        double Sum = 0.0;
        double harmonic = 0.0;

        //Calculating Harmonic Mean;
        for (int i = 0; i < numbers.length; i++){
            Sum += numbers[i];
            harmonic += 1.0/ numbers[i];
        }
        //Finding mean;
        double avarageList = Sum / numbers.length;
        double harmonicMean = numbers.length/ harmonic;
        System.out.println("Harmonic mean of this list equals to:" + harmonicMean);
        System.out.println("Mean of this list equals:" + avarageList);

    }
}