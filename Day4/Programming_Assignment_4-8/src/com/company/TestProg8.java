package com.company;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class TestProg8 {
    @Test
    public void testMin(){
        int[] testInput={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minNum=Prog8.min(testInput);
        Assertions.assertEquals(-22, minNum);
    }
}
