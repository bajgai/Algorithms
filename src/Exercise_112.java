public class Exercise_112 {
    public static void main(String[] args) {
        double a = (1 + 2.236) / 2;
        String type_a = ((Object) a).getClass().getSimpleName();
        System.out.printf("a has value: %e and type: %s %n", a, type_a);

        double b = 1 + 2 + 3 + 4.0;
        String type_b = ((Object) b).getClass().getSimpleName();
        System.out.printf("b has a value: %e and type: %s %n", b, type_b);

        boolean c = 4.1 >= 4;
        String type_c = ((Object) c).getClass().getSimpleName();
        System.out.printf("c has a value: %s and type: %s %n", c, type_c);

        String d = 1 + 2 + "3";
        String type_d = ((Object) d).getClass().getSimpleName();
        System.out.printf("d has a value: %s and type: %s %n", d, type_d);
    }
}
