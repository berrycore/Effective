package chapter17_inheritance_restriction;

import java.util.Date;

public class Sub extends  Super{

    private final Date date;

    /*
    * Sub 클래스의 생성자가 호출되기 전에
    * Super 클래스의 생성자가 호출되며 이 때 Date 는 null 이다
    * Super 클래스의 생성자에서 overrideMe() 를 호출하며
    * Sub 클래스에 재정의된 overrideMe() 가 호출되며 이 때 date 는 null 이 출력 된다.
    *
    * System.out.println()에 의해서 null 이 표시되는 것임.
    * 그렇지 않았다면 NullPointerException 이 발생 되었을 것임.
    *
    * 특히, List , Set , Map 과 같은 Collection 을 굳이 상속하려 하지 말고
    * Wrapper class 패턴을 이용하라
    *
    * */
    Sub(){
        date = new Date();
    }

    @Override
    public void overrideMe() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
