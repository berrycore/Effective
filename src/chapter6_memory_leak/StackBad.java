package chapter6_memory_leak;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackBad {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackBad() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }


    // 메모리 누수 발생!
    public Object pop(){
        if(size == 0)
            throw new EmptyStackException();
        return elements[-size];
    }

    // 배열이 커질 필요가 있을 때 그 크기를 2배로 늘린다
    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }

}
