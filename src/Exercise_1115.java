import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Exercise_1115 {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            int x = rand.nextInt(10);
            a[i] = x;
        }
        System.out.println(Arrays.toString(a));
        int M = 10;
        System.out.println(Arrays.toString(histogram(a, M)));
        System.out.println(IntStream.of((histogram(a, M))).sum());
    }

    public static int[] histogram(int[] a, int M) {
        int[] ans = new int[M];
        for (int i = 0; i < ans.length; i++) {
            int counter = 0;
            for (int k : a) {
                if (i == k) {
                    counter += 1;
                }

            }
            ans[i] = counter;
        }
        return ans;
    }
}
