public class islandprob {
    static int[][] mat = { { 1, 1, 1, 1, 0 }, { 1, 0, 1, 1, 0 }, { 1, 0, 0, 1, 0 }, { 0, 1, 0, 0, 1 } };
    static int r = 4, c = 5;

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println("Number of islands: " + count);
    }

    static void dfs(int i, int j) {
        if (i < 0 || i >= r || j < 0 || j >= c || mat[i][j] == 0)
            return;
        mat[i][j] = 0; 

        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);
    }
}
