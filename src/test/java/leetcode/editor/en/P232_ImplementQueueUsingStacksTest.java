package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P232_ImplementQueueUsingStacksTest {

    P232_ImplementQueueUsingStacks.MyQueue myQueue;

    @BeforeEach
    void setUp() {
        myQueue = new P232_ImplementQueueUsingStacks().new MyQueue();
    }

    @Test
    void ImplementQueueUsingStacks() {
        myQueue.push(1);
        myQueue.push(2);
        //[1, 2(top)]
        assertEquals(1, myQueue.peek());
        assertEquals(1, myQueue.pop());
        assertEquals(false, myQueue.empty());

    }
}