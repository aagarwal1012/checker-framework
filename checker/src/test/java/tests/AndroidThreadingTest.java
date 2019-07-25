package tests;

import java.io.File;
import java.util.List;
import org.checkerframework.framework.test.CheckerFrameworkPerDirectoryTest;
import org.junit.runners.Parameterized.Parameters;

/** Test runner for tests of the AndroidThreading-Checker. */
public class AndroidThreadingTest extends CheckerFrameworkPerDirectoryTest {
    public AndroidThreadingTest(List<File> testFiles) {
        super(
                testFiles,
                org.checkerframework.checker.androidthreading.AndroidThreadingChecker.class,
                "androidthreading",
                "-Anomsgtext");
    }

    @Parameters
    public static String[] getTestDirs() {
        return new String[] {"androidthreading"};
    }
}
