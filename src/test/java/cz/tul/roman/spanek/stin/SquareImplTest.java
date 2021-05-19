package cz.tul.roman.spanek.stin;

import cz.tul.roman.spanek.stin.impl.SquareImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SquareImplTest {

    private SquareImpl square = new SquareImpl();

    @Test
    void testSquare(){
        Assert.assertEquals(4, square.square(2));
    }

    @Test
    void testSquareError(){
        Assert.assertEquals( (4 * 4) , square.square(4));
    }
}
