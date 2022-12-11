package JNunitTesting;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;


class calculatorTest {

    calculator c = new calculator();
    @Test
    void sum() {
        assertEquals(7,c.sum(5,2));
    }

    @Test
    void substract() {
    }

    @Test
    void kefel() {
    }

    @Test
    void div() {
    }
}