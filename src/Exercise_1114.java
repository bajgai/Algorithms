public class Exercise_1114 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.print(lg(N));

    }

    public static int lg(int N) {
        int y = 0;
        while (N >= 2) {
            N /= 2;
            y += 1;

        }
        return y;
    }
}
