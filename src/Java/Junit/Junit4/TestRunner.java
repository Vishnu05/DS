package Java.Junit.Junit4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String args[]) {

        System.out.println("the mystery of Sting args " + args);

        Result result = JUnitCore.runClasses(TestUnit.class);

        for(Failure failure: result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
