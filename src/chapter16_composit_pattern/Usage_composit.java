package chapter16_composit_pattern;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    }
}
