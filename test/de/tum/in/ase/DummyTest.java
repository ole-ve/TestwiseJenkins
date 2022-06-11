package de.tum.in.ase;

import de.tum.in.test.api.jupiter.PublicTest;
import org.junit.jupiter.api.Test;

public class DummyTest {
    @PublicTest
    public void dummyTest0() {
        DummyClass dummyClass = new DummyClass();
        dummyClass.doNothing(2);
        int i = 0;
    }

    @Test
    public void dummyTest() {
        int i = 1;
    }
}
