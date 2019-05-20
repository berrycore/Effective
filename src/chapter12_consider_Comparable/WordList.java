package chapter12_consider_Comparable;

import java.util.*;

public class WordList {
    public static void main(String[] args) {

        // 1) default sort
        String[] months = {"JAN", "FEB", "MAR", "APRIL"};
        Set<String> set = new TreeSet<>();
        Collections.addAll(set, months);
        System.out.println(set);
        // result ; 알파벳 순으로 정렬됨
        // [APRIL, FEB, JAN, MAR]

        ArrayList<Point> list = new ArrayList<>();
        list.add(new Point(30, 40));
        list.add(new Point(100,30));
        list.add(new Point(10,20));

        System.out.println("before sort");
        for(Point point : list){
            System.out.println("getX() : " + point.getX() + " getY() : " + point.getY());
        }

        // 2) implemented Comparator<>
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if(p1.getX() > p2.getX() || p1.getY() > p2.getY()){
                    return 1;
                }else if(p1.getX() < p1.getX() || p1.getY() < p2.getY()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        System.out.println("after sort");
        for(Point point : list){
            System.out.println("getX() : " + point.getX() + " getY() : " + point.getY());
        }


        // 3) override compareTo()
        /**
         * compareTo 메소드
         * 1) 현재 객체의 값이 지정 객체보다 작으면 음수정수를 같으면 0을, 크면 양수정수를 반환한다.
         *    만일 지정 객체의 타입이 현재 객체와 비교할 수  없는 타입이면 ClassCastException 예외 발생.
         *
         * 2) 모든 x 와 y 에 대하여 sgn(x.compareTo(y)) == -sgn(y.compareTo(x)) 가 되도록 한다.
         *
         * 3) 이행적인 관계가 성립되어야 한다.
         *    즉, (x.compareTo(y) > 0 && y.compareTo(x) > 0) 이면 x.compareTo(x) > 0 이어야 한다
         *
         * 4) x.compareTo(y) == 0 이라면 모든 z 에 대해 sgn(x.compareTo(z)) == sgn(y.compareTo(z)) 가 되어야 한다.
         *
         * 5) 반드시 요구되는 것은 아니지만, (x.compareTo(y) == 0) == (x.equals(y)) 가 되도록 하는 것이 좋낟.
         *    만약 Comparable 인터페이스를 구현하면서 이 조항을 지키지 않는 클래스에서는 API 문서에 분명히 밝힌다.
         *
         * */
        PhoneNumber pn1 = new PhoneNumber(111,555,1111);
        PhoneNumber pn2 = new PhoneNumber(111,555,5555);
        PhoneNumber pn3 = new PhoneNumber(222,555,5555);
        System.out.println("pn1.compareTo(pn2) : " + pn1.compareTo(pn2) );  // -4444
        System.out.println("pn2.compareTo(pn1) : " + pn2.compareTo(pn1) );  //  4444
        System.out.println("pn3.compareTo(pn2) : " + pn3.compareTo(pn2) );  //   111
    }



}
