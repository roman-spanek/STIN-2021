package cz.tul.roman.spanek.stin;

import cz.tul.roman.spanek.stin.impl.StinToTestImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StinToTestImplTest {

    private StinToTestImpl stinToTest = new StinToTestImpl();;

    @Test
    void sumMehodTest() {
        Assertions.assertEquals(12, stinToTest.sum(10 , 2));
    }

    @Test
    void sumMehodTest2(){
        Assertions.assertEquals(12, stinToTest.sum(10 , 2));
    }

}
