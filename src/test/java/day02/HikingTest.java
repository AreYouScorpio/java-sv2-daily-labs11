package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testGetPlusElevation() {
        int result = new Hiking().getPlusElevation(List.of(10, 20, 25, 15, 18));
        assertEquals(18, result);
    }

}