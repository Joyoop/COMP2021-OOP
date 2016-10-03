import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by lizbai on 2/10/16.
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);

        if(result.wasSuccessful()){
            System.out.println("PASS");
        }
        else{
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}
