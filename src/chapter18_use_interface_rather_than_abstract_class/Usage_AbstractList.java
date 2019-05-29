package chapter18_use_interface_rather_than_abstract_class;

import java.util.*;


public class Usage_AbstractList {

    static List<Integer> intArrayList(final int[] a){
        if( a == null )
            throw new NullPointerException();

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];    // Autoboxing
            }

            @Override
            public Integer set(int index, Integer val) {
                int oldVal = a[index];
                a[index] = val;     // Auto-unboxing
                return oldVal;      // Autoboxing
            }

            @Override
            public int size() {
                return a.length;
            }
        };  //anonymous class

    }

    public static void main(String[] args) {

        // 1) AbstractList
        int[] arrayInt = {1,2,3,4,5};
        List<Integer> integerList = Usage_AbstractList.intArrayList(arrayInt);

        System.out.println("get(0) : " + integerList.get(0));
        System.out.println("size() : " + integerList.size());

        integerList.set(3,100);  // 4번째 값을 100 으로 교체

        for(Integer integer : integerList){
            System.out.println(integer.floatValue());
        }
    }
}
