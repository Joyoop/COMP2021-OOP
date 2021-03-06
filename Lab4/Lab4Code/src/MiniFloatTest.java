import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lizbai on 30/9/16.
 */
public class MiniFloatTest {

    MiniFloat mf = null;
    @Before
    public void setUp() throws Exception {
        mf = new MiniFloat();
    }

    @Test
    public void testminiFloatFromString() throws Exception{
        Class[] cArg = new Class[1];
        cArg[0] = String.class;// method argument
        Method testMFFS = mf.getClass().getDeclaredMethod("miniFloatFromString",cArg);// get relevant method
        testMFFS.setAccessible(true); // declare its accessibility to true
        Object result;
        result = testMFFS.invoke(mf,"00100110"); // run the method
        //System.out.println(result);
        float res = 28;
        /* insert your code below */
        // Answer
        assertEquals(res,result);
        result = testMFFS.invoke(mf,"10100110");
        res = -28;
        assertEquals(res, result);
    }
}
