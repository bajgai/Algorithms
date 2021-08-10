public class Exercise_117 {
    //Give the value printed by each of the following code fragments.
    public static void main(String[] args) {
        //a
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        System.out.printf("%.5f%n", t);

        //b
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);

        //c
        // int sum = 0;
        //for (int i = 1; i < 1000; i *= 2)
        //    for (int j = 0; j < N; j++)
        //        sum++;
        //StdOut.println(sum);
        //Answer --> there is an uninitialized variable N
    }
}
