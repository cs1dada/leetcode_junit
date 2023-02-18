package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P200_NumberOfIslandsTest {

    P200_NumberOfIslands.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P200_NumberOfIslands().new Solution();
    }

    @Test
    void test() {
        char grid[][] = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        assertEquals(3,solution.numIslands(grid));
    }
}