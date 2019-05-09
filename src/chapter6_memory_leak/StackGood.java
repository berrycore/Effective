package chapter6_memory_leak;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackGood {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackGood() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if(size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;  //배열이 Object 인스턴의스에 더이상 접근하지 않으므로 null 로 명시
        return result;
    }

    // 배열이 커질 필요가 있을 때 그 크기를 2배로 늘린다
    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }
}
