package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P169_MajorityElementTest {

    P169_MajorityElement.Solution solution;


    @BeforeEach
    void setUp() {
        solution = new P169_MajorityElement().new Solution();
    }

    @Test
    void majorityElement() {
        int[] arr = { 3,3,4};
        int answer = 3;

        assertEquals(answer,solution.majorityElement(arr));
    }
}