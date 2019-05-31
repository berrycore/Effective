package chapter22_how_to_use_static_member_class;

import java.util.HashSet;
import java.util.Set;

public class Usage_static_member_class {

    public static void main(String[] args) {

        System.out.println( Calculator.Operation.MINUS );
        System.out.println( Calculator.Operation.PLUS );


        MySet<String> mySet = new MySet<>();
        mySet.add("element1");
        mySet.add("element2");

        System.out.println(mySet.getCount());

        if(mySet.iterator().hasNext()){
            System.out.println(mySet.iterator().next());
        }

        System.out.println(mySet.getCount());
    }
}
