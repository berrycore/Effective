package chapter7_finalizer;

public class Foo {

    private String name = "Foo";

    public void printName(){
        System.out.println(name);
    }


    @Override
    protected void finalize() throws Throwable {


        try{
            System.out.println("finalize() - try called");
            //TODO : code here ...
        }finally {
            super.finalize();
            System.out.println("finalize() - finally called");

        }
    }

    private final Object finalizerGuardian = new Object(){
        @Override
        protected void finalize() throws Throwable {
            super.finalize();

            System.out.println("finalizerGuardion - finalize()");
        }
    };

}
