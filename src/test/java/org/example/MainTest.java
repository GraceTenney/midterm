package org.example;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class MainTest {
    public MainTest() {

    }
    @Test
    public void doThing() {
        Assertions.assertTrue(Main.checkThing(0));
        Assertions.assertFalse(Main.checkThing(1));
    }
}