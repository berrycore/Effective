package chapter23_generic_do_not_use_raw_type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Usage_generic {

    public static void main(String[] args) {

        // 1)
        ArrayList myList = new ArrayList();
        myList.add(new Stamp());
        myList.add(new Coin());

//        for(Iterator iter = myList.iterator(); iter.hasNext();){
//            Stamp s = (Stamp)iter.next();      // runtime error occur when get the coin.
//        }
//
//        // 2)
//        ArrayList<Stamp> myList2 = new ArrayList<>();
//        myList2.add(new Stamp());
//        myList2.add(new Coin());    // compile error occur
//
//
//        // 2) -1
//        for (Iterator iter = myList2.iterator(); iter.hasNext();) {
//            Stamp s = iter.next();  // compile error occur
//        }
//
//        // 2) -2
//        for (Iterator<Stamp> iter = myList2.iterator(); iter.hasNext();) {
//            Stamp s = iter.next();
//        }


        // 3)
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, new Integer(42));
        String s = strings.get(0);      // runtime error occur when get the Integer 42.

    }

    static int numElementsInCommonBad(Set s1, Set s2){
        int result = 0;
        for(Object o1 : s1){
            if(s2.contains(o1))
                result++;
        }
        return result;
    }

    static int numElementsInCommonGood(Set<?> s1, Set<?> s2){
        int result = 0;
        for(Object o1 : s1){
            if(s2.contains(o1))
                result++;
        }
        return result;
    }

    private static void unsafeAdd(List list, Object o){
        list.add(o);
    }
}
