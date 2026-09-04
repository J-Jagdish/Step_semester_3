import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- L1: Two Sum ---");
        TwoSum p1 = new TwoSum();

        // Testing the exact inputs from your assignment guide
        int[] result1 = p1.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Input 1 Output: " + Arrays.toString(result1)); // Expected: [0, 1]

        int[] result2 = p1.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Input 2 Output: " + Arrays.toString(result2)); // Expected: [1, 2]
    }
}