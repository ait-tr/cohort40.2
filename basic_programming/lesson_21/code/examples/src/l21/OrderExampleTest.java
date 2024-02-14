package l21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;

public class OrderExampleTest {
    int expected;
    static int expected2;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass()");
        expected2 = 5;
    }

    @BeforeEach
    public void setUp() {
        System.out.println("setUp()");
        this.expected = 5;
    }

    @Test
    public void testX() {
        System.out.println("testX()");
    }

    @Test
    public void testY() {
        System.out.println("testY()");
    }

    @Test
    public void testZ() {
        System.out.println("testZ()");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown()");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }
}
