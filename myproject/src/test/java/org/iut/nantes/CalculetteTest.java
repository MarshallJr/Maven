package org.iut.nantes;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculetteTest {

 Calculette cal = new Calculette();
    @Test
    public void testAddition()
    {
        assertEquals( cal.addition(5, 6),11 );

    }

}
