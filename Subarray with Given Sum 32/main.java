import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        HashSet<Long> prefix = new HashSet<>();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k || prefix.contains(sum - k)) {
                System.out.println("YES");
                return;
            }

            prefix.add(sum);
        }

        System.out.println("NO");
    }
}