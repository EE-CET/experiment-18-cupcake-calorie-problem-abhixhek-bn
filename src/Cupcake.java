    
import java.util.*;

public class Cupcake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a, Collections.reverseOrder());

        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += (long) a[i] * (1L << i);
        }
        System.out.println(miles);
    }
}

    

