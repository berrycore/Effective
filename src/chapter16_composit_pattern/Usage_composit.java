package chapter16_composit_pattern;

import java.util.*;

public class Usage_composit {

    public static void main(String[] args) {

        InstrumentedHashSet<String> hs = new InstrumentedHashSet<>();
        hs.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(hs.getAddCount());   // addCount is 6,  not 3


        // * Composition Pattern
        // Forwarding class : ForwardingSet<E> implements Set<E>
        // composited class : InstrumentedSet<E> extends ForwardingSet<E>

        InstrumentedSet<String> s = new InstrumentedSet<String>(new HashSet<>());
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());    // addCount is 3



        Set<Date> dateSet = new InstrumentedSet<Date>(new TreeSet<Date>());
        dateSet.add(new Date(System.currentTimeMillis()));
        for(Object obj  : dateSet.toArray()){
            Date date= (Date)obj;
            System.out.println(date);
        }

    }
}
