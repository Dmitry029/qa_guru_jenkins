package qa.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimplePositiveTests {

    @Test
    void Test01() {
        System.out.println("Test01");
    }

    @Test
    void someTest() {
        assertTrue(true);
    }

    @Test
    void someTest1() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void someTest3() {
        assertTrue(false);
    }

}
