//What (if anything) is wrong with each of the following statements
public class Exercise_114 {
    public static void main(String[] args) {
        String a = "if (a > b) then c = 0";
        System.out.println("There is no conditional 'then' in java");

        String b = "if a > b {c = 0;}";
        System.out.println("bracket is missing between a > b " +
                "and semicolon in the wrong place");

        String c = "if (a > b) c = 0;";
        System.out.println("Nothing wrong");

        String d = "if (a > b) c = 0 else b =0;";
        System.out.println("missing semicolon after c = 0");

    }
}
