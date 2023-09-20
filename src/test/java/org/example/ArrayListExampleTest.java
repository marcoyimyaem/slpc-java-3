package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListExampleTest {

    @org.junit.jupiter.api.Test
    void addAllNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        int expectedSum = 15; // Sum of 1 + 2 + 3 + 4 + 5

        // Call the method to get the sum
        int actualSum = ArrayListExample.addAllNumbers(arr);

        // Check if the actual sum matches the expected sum
        assertEquals(expectedSum, actualSum);
    }
}