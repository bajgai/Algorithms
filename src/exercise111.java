public class exercise111 {
    public static void main(String[] args) {
        int a = (0 + 15) / 2;
        System.out.println(String.format("a = %d", a));
        double b = 2.0 * Math.exp(-6) * 100000000.1;
        System.out.println(String.format("b = %g", b));
        boolean c = true && false || true && true;
        System.out.println(String.format("c = %b", c));
    }
}
