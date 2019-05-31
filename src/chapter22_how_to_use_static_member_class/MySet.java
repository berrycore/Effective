package chapter22_how_to_use_static_member_class;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;

public class MySet<E> extends AbstractSet<E> {


    private HashSet<E> hashSet = new HashSet<>();
    private int count = 0;

    public int getCount(){
        return count;
    }

    @Override
    public boolean add(E e) {
        return hashSet.add(e);
    }

    @Override
    public int size() {
        return hashSet.size();
    }

    public Iterator<E> iterator(){
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E>{
        @Override
        public boolean hasNext() {
            return hashSet.iterator().hasNext();
        }

        @Override
        public E next() {
            count++;
            return hashSet.iterator().next();
        }
    }

}
