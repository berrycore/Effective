package chapter35_use_annotation_instead_of_naming_pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {

    public static void main(String[] args) throws Exception{

        int tests = 0;
        int passed = 0;
        Class testClass = Class.forName(args[0]);
        for(Method m : testClass.getDeclaredMethods()){
            if(m.isAnnotationPresent(Test.class)){
                tests++;
                try{
                    m.invoke(null);
                    passed++;
                }catch(InvocationTargetException wrappedExc){
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch(Exception exc){
                    System.out.println("INVALID @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n" , passed , tests-passed);

    }

    // OUTPUT
    //
    // public static void chapter35_use_annotation_instead_of_naming_pattern.Sample.m3() failed: java.lang.RuntimeException: Boom
    // INVALID @Test: public void chapter35_use_annotation_instead_of_naming_pattern.Sample.m5()
    // public static void chapter35_use_annotation_instead_of_naming_pattern.Sample.m7() failed: java.lang.RuntimeException: Crash
    // Passed: 1, Failed: 3
    //
    // Process finished with exit code 0
}
