public class exercise112 {
    public static void main(String[] args) {
        double a = (1 + 2.236) / 2;
        String type_a = ((Object) a).getClass().getSimpleName();
        System.out.println(String.format("a has value: %e type: %s", a, type_a));

        double b = 1 + 2 + 3 + 4.0;
        String type_b = ((Object) b).getClass().getName();

        boolean c = 4.1 >= 4;
        String type_c = ((Object) c).getClass().getName();

        String d = 1 + 2 + "3";
        String type_d = ((Object) d).getClass().getName();


    }
}
