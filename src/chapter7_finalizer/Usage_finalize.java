package chapter7_finalizer;

public class Usage_finalize {

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.printName();
        foo = null;
        System.gc();
    }

}
