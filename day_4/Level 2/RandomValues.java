import java.util.Random;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = rand.nextInt(9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to calculate the average, minimum, and maximum values of an array
    public double[] findAverageMinMax(int[] numbers) {
        double[] results = new double[3];
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;
        results[0] = average;
        results[1] = min;
        results[2] = max;

        return results;
    }

    public static void main(String[] args) {
        RandomValues obj = new RandomValues();
        int[] randomNumbers = obj.generate4DigitRandomArray(5);

        System.out.print("Generated 4-digit random numbers: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();

        double[] stats = obj.findAverageMinMax(randomNumbers);

        System.out.println("Average value " + stats[0] + " and Minimum value " + stats[1] + " and Maximum value " + stats[2]);
        
    }
}
