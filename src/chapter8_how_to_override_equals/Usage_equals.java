package chapter8_how_to_override_equals;

public class Usage_equals {

    // equals overriding 계약 조건
    //
    // 1. 재귀적 (Reflexive)
    //     null 이 아닌 모든 참조값에 대해서 x.equals(x) 는 반드시 true 를 반환 해야 한다.
    //
    // 2. 대칭적 (Symmetric)
    //
    //     null 이 아닌 모든 참조값 x와 y에 대해 y.equals(x) 가 true 를 반환 한다면
    //                                        x.equals(y) 도 true 를 반환해야 한다.
    //
    // 3. 이행적 (Transitive)
    //     null 이 아닌 모든 참조값 x,y,z에 대해 만일 x.equals(y) 가 true 를 반환하고
    //                                             y.equals(z) 가 true 를 반환한다면
    //                                             x.equals(z) 도 반드시 true 를 반환해야 한다
    //
    // 4. 일관적 (Consistent)
    //     null 이 아닌 모든 참조값 x와 y에 대해, equals 메소드에서 객체 비교시 사용하는 정보가 변경되지 않는다면
    //     x.equals(y) 를 여려번 호출하더라도 일관성 있게 true 또는 false 를 반환해야 한다.
    //
    // 5. null 이 아닌 모든 참조값 x에 대해, x.equals(null) 은 반드시 false 를 반환해야 한다.

    public static void main(String[] args) {

        CaseInsensitiveStringBad cisb = new CaseInsensitiveStringBad("Polish");
        CaseInsensitiveStringGood cisg = new CaseInsensitiveStringGood("Polish");
        String s = "polish";


        System.out.println("cisb.equals(s) : " + cisb.equals(s)); // true
        System.out.println("s.equals(cisb) : " + s.equals(cisb)); // false

        System.out.println("cisg.equals(s) : " + cisg.equals(s)); // false
        System.out.println("s.equals(cisg) : " + s.equals(cisg)); // false


    }
}
