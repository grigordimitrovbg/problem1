
package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private String str;
    private long solution;

    @Test
    void testMain() {
    }


    @Test
    void printCombinations() {
        long[] nominals1 = {1, 2, 3};
        long[] counts1 = {0, 0, 0};
        long summ1 = 10;
        String result1 = Main.printCombinations(nominals1, counts1, 0, summ1);
     //   long[] nominals2 = {3, 5};
     //   long[] counts2 = {0, 0};
      //  long summ2 = 8;
     //   String result2 = Main.printCombinations(nominals2, counts2, 0, summ2);
        String expected1 = "1*0  2*2  3*2  1\n" +
                "1*0  2*5  3*0  2\n" +
                "1*1  2*0  3*3  3\n" +
                "1*1  2*3  3*1  4\n" +
                "1*2  2*1  3*2  5\n" +
                "1*2  2*4  3*0  6\n" +
                "1*3  2*2  3*1  7\n" +
                "1*4  2*0  3*2  8\n" +
                "1*4  2*3  3*0  9\n" +
                "1*5  2*1  3*1  10\n" +
                "1*6  2*2  3*0  11\n" +
                "1*7  2*0  3*1  12\n" +
                "1*8  2*1  3*0  13\n" +
                "1*10  2*0  3*0  14\n";
        assertEquals(expected1, result1);
    }
}

