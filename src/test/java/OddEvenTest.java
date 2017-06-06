
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kowlalis on 6/6/17.
 */
public class OddEvenTest {
    @Test
    public void testOdd(){
        OddEven oddEven = new OddEven();
        assertEquals("Odd",oddEven.checkIfOddOrEven(5));
    }
    @Test
    public void testEven(){
        OddEven oddEven = new OddEven();
        assertEquals("Even", oddEven.checkIfOddOrEven(4));
    }
}
