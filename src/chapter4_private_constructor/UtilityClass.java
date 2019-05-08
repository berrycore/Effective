package chapter4_private_constructor;

public class UtilityClass {

    // default constructor could not call
    private UtilityClass(){
        throw new AssertionError();
    }
}
