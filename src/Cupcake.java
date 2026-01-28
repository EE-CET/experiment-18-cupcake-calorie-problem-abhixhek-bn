    

import java.util.*;


public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] calories = new Integer[n];
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        // Sort in descending order
        Arrays.sort(calories, Collections.reverseOrder());

        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += calories[i] * (long)Math.pow(2, i);
        }

        System.out.println(miles);
    }
}


    

