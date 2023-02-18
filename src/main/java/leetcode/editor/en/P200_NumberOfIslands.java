package leetcode.editor.en;

// P200_NumberOfIslands

public class P200_NumberOfIslands {

    public static void main(String[] args) {

        Solution solution = new P200_NumberOfIslands().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numIslands(char[][] grid) {
            int row = grid.length;
            int column = grid[0].length;
            //System.out.println("row: " + row + ", column: " + column);
            int res = 0;

            for (int i = 0; i < row; i++)
                for (int j = 0; j < column; j++) {
                    //該島的陸地只算一個, 其他相連的都不算(都給他淹沒)
                    if (grid[i][j] == '1') {
                        res++;
                        dfs(i, j, grid);
                    }
                }
            return res;

        }

        void dfs(int i, int j, char grid[][]) {
            int row = grid.length;
            int column = grid[0].length;
            //超過grid邊界了, 不合法!!!
            if (i < 0 || j < 0 || i >= row || j >= column) {
                return;
            }

            //已經走過了
            if (grid[i][j] == '0') {
                return;
            }

            //沒走過, 淹沒此點避免重複走
            if (grid[i][j] == '1') {
                grid[i][j] = '0';
            }

            //由此點往下做dfs
            dfs(i + 1, j, grid);
            dfs(i - 1, j, grid);
            dfs(i, j + 1, grid);
            dfs(i, j - 1, grid);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}