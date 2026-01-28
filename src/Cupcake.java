import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Sort descending
        Arrays.sort(a, Collections.reverseOrder());

        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += a[i] * (long)Math.pow(2, n - 1 - i);
        }

        System.out.println(miles);
    }
}
