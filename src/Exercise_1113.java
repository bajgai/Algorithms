public class Exercise_1113 {
    public static void main(String[] args) {
        int M = 3;
        int N = 2;
        int c = 0;
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                c++;
                arr[i][j] = c;
                System.out.printf("%dX%d: %d \n", i, j, c);
            }
        }
        int[][] arr_transpose = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int ans = arr[j][i];
                arr_transpose[i][j] = arr[j][i];
                System.out.printf("%dX%d: %d \n", i, j, ans);
            }
        }
    }
}
