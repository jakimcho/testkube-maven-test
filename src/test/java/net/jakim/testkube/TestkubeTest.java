package net.jakim.testkube;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A sets of tests for testkube")
public class TestkubeTest {

    @Test
    @DisplayName("Lets test the testkube capabilities when test is passing")
    public void simpleTest1() {
        Assertions.assertEquals(30, 30, "30 is equal to 30");
    }

    @Test
    @DisplayName("Lets test the testkube capabilities when test is failing")
    public void simpleTest2() {
        Assertions.assertEquals(30, 40, "30 is not equal to 40");
    }
}
