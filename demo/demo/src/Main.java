import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,4,5,3,3,4,6,7,4,9,4};
        int mostRepeatedValue = findMostRepeatedValue(array);
        System.out.println("Most repeated value: " + mostRepeatedValue);
    }

    public static int findMostRepeatedValue(int[] array) {
        // Create a HashMap to store the frequency of each value
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and count the frequency of each value
        for (int value : array) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        int mostRepeatedValue = -1;
        int highestFrequency = -1;

        // Iterate through the frequency map to find the most repeated value
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int value = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                mostRepeatedValue = value;
            }
        }

        return mostRepeatedValue;
    }
}
