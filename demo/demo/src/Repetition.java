import java.util.Arrays;

public class Repetition {

    public static void main(String[] args) {

        int[] arr = {1,4,5,3,3,3,4,6,7,4,9,4};
        int[] arr1 = new int[arr.length];
        int count = 0;
        int temp =0;


        for (int j : arr) {

            for (int i : arr) {

                if (j == i) {

                    count++;
                }

            }

            arr1[temp++] = count;
            count =0;
//

        }

        System.out.println(Arrays.stream(arr1).boxed().max(Integer::compare).get());
    }



}
