package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner1 {
	public static void main(String args[]) {
		Result r = JUnitCore.runClasses(TestCase1.class,TestCas2.class);
		System.out.println(r.getRunCount());
		for(Failure f:r.getFailures()) {
			System.out.println(f);
		}
		
	}
}
