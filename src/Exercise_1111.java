public class Exercise_1111 {
    public static void main(String[] args) {
        boolean[][] a = {{true, false}, {true, false}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                boolean x = a[i][j];
                String ans;
                if (x) {
                    ans = "*";
                } else {
                    ans = "_";
                }
                System.out.printf("(%d,%d): %s \n", i, j, ans);
            }

        }
    }
}
