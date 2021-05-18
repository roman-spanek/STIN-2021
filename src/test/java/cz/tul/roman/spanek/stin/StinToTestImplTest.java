package cz.tul.roman.spanek.stin;

import cz.tul.roman.spanek.stin.impl.StinToTestImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StinToTestImplTest {

    private StinToTestImpl stinToTest = new StinToTestImpl();;

    @Test
    public void sumMehodTest() {
        Assertions.assertEquals(stinToTest.sum(10 , 2), 12);
        Assertions.assertEquals(stinToTest.sum(10 , 1), 11);
    }

    @Test
    public void sumMehodTest2(){
        Assertions.assertEquals(stinToTest.sum(10 , 3), 12);
    }
}
