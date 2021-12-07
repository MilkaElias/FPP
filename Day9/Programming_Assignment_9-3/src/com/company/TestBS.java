package com.company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestBS {

        @Test
        public void binarySearchTest(){
            String testInput1="hello";
            boolean result =BinSearch.search(testInput1,'e');
            Assertions.assertEquals(true, result);

            boolean result2=BinSearch.search("hello", 'p');
            Assertions.assertEquals(false, result2);


        }
}
