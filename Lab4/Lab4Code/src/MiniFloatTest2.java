import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by lizbai on 2/10/16.
 */
public class MiniFloatTest2 {

    MiniFloat mf = null;
    @Before
    public void setUp() throws Exception {
        mf = new MiniFloat();
    }

    @Test
    public void testminiFloatFromString() throws Exception {
        /* insert your code below */
       //Answer:
         assertTrue(222==mf.printIntegralMiniFloats());
    }
}
