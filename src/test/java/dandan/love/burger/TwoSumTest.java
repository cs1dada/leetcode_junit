package dandan.love.burger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        twoSum = new TwoSum();
    }

    @Test
    void twoSumBruteForce() {
        int[] numsArray = { 1, 3, 7, 9, 2 };
        int target = 11;
        int[] answer = {3,4};

        assertArrayEquals(answer,  twoSum.twoSumBruteForce(numsArray, target));
    }

    @Test
    void twoSumOptimal() {
    }

    @Test
    void main() {

    }
}