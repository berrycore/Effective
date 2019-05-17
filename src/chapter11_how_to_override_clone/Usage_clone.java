package chapter11_how_to_override_clone;

public class Usage_clone {
    public static void main(String[] args) {

        PhoneNumber pn_origin = new PhoneNumber(031,333,4444);
        PhoneNumber pn_cloned = pn_origin.clone();

        System.out.println(pn_origin);
        System.out.println(pn_cloned);

        System.out.println( pn_origin != pn_cloned);                        // true
        System.out.println( pn_origin.getClass() == pn_cloned.getClass());  // true
        System.out.println( pn_origin.equals(pn_cloned));                   // true
    }

    /**
     * Cloneable 의 단점이 많기 때문에 배열 복제 정도가 아닌 이상
     * 숙련된 프로그래머들은 clone 메소드를 전혀 오버라이드 하지 않고 호출하지도 않는다.
     *
     * 단점
     *  1) final 키워드가 붙은 필드의 처리 곤란
     *  2) deepCopy 시 clone() 재귀적 호출시 일일이 deepCopy 할 때 재귀호출 또는 반복문으로 처리, 코드 복잡해짐
     *
     *
     * 상속을 해주기 위한 클래스를 설계할 때 잘 동작하는 protected clone 메소드를 그 클래스에 두지 않는 다면
     * 서브 클래스에서 Cloneable 인터페이스를 제대로 구현할 수 없다는 것을 명심.
     *
     * 굳이 Cloneable 을 구현 한다면
     *  1) 자신의 클래스를 반환타입으로 하는 public 메소드로 clone 를 오버라이드 한다.
     *  2) super.clone() 를 호출한 후
     *  3) 여타 필드들의 복제를 처리 한 다음
     *  4) return 한다
     *
     * 그리하여, 복제 생성자 또는
     *      public Yum(Yum yum);
     *
     * 복제 펙토리 메소드를 사용하라
     *      public static Yum newInstance(Yum yum)
     *
     * */

}
