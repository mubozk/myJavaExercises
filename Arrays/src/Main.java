import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {2, 3, 5, 1, 4};
        int count = numbers.length;
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //Multidimensionals
        // |
        // V
        int[][] numbersMulti = new int[2][3];
        numbersMulti[0][0] = 1;
        System.out.println(Arrays.deepToString(numbersMulti));
    }
}