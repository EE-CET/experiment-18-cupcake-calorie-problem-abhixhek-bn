import java.util.*;

public class Cupcake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] calories = new Integer[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        // Step 1: Sort calories in descending order
        Arrays.sort(calories, Collections.reverseOrder());

        // Step 2: Calculate minimum miles
        long miles = 0;
        long power = 1; // 2^0

        for (int i = 0; i < n; i++) {
            miles += calories[i] * power;
            power *= 2; // next power of 2
        }

        // Step 3: Print result
        System.out.println(miles);
    }
}
