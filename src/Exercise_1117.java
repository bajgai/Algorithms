public class Exercise_1117 {
    public static void main(String[] args) {
        System.out.println(exR2(6));

    }

    public static String exR2(int n) {
        // n <= 0 is never checked... it should be above s = ... statement
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
