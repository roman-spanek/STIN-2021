package cz.tul.roman.spanek.stin;

import cz.tul.roman.spanek.stin.impl.StinToTestImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class StinToTestImplTest {
    private StinToTestImpl stinToTest;
    @Before
    public void init(){
        stinToTest = new StinToTestImpl();
    }

    @Test
    public void sumMehodTest() {
        Assert.assertEquals(stinToTest.sum(10 , 2), 12);
    }
}
