package chapter9_how_to_override_hashCode;

public final class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber){

        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999,"prefix");
        rangeCheck(lineNumber, 9999, "line number");

        this.areaCode = (short)prefix;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }


    private static void rangeCheck(int arg, int max, String name) {
        if(arg < 0 || arg > max){
            throw new IllegalArgumentException(name +" : " + arg);
        }
    }

    @Override
    public boolean equals(Object obj) {

        if( obj == this){                       // 1. 자기 자신 확인
            return true;
        }

        if(!(obj instanceof  PhoneNumber )){    // 2. 인스턴스 확인
            return false;
        }

        PhoneNumber pn = (PhoneNumber) obj;     // 3. 같으면 casting


        return pn.lineNumber == this.lineNumber
                && pn.prefix == this.prefix
                && pn.areaCode == this.areaCode;  // 4. 멤머필드 3개 값 모두 같은지 확인
    }

    // TODO : overriding - hashCode
    // 1. 예를들어, 17 (소수 : 素数) 와 같이 0이 아닌 어떤 상수 값을 result 라는 int 변수에 저장한다.
    // 2. 객체의 각 주요 필드 (equals 메소드에서 비교하는) f 에 대해 다음과 같이 작성한다.
    //
    //    a. 각 필드에 대한 int 타입의 해시 코드 c 를 다음과 같이 산출한다.
    //       i.   필드 f가 boolean 타입이면, (f ? 1 : 0 )
    //       ii.  필드 f가 byte, char, short, int 타입이면, (int)f
    //       iii. 필드 f가 long 타입이면, (int)(f ^ f >>> 32))
    //       iv.  필드 f가 float 타입이면, Float.floatToIntBits(f)
    //       v.   필드 f가 double 타입이면, Double.doubleToLongBits(f) 를 실행한 후
    //            반환된 long 타입을 2.a.iii 처럼 처리하여 해시 코드 값을 구한다
    //       vi.  필드 f가 객체 참조일 경우는 현재(equals 메소드가 호출된) 객체의 equals 메소드에서
    //            그 필드를 비교하기 위해 f 가 참조하는 객체의 equals 메소드를 재귀적으로 호출한다.
    //            그러면 그 객체의 필드에 대해 hashCode 메소드도 재귀적으로 자동 호출 된다.
    //            만일 더 복잡한 비교가 필요하다면 필드의 "포준 형식" 을 만들어 처리하고
    //            그 표준 형식에 대해 hashCode 메소드를 호출한다.
    //            만일 필드 f 의 값이 null 이면, 0 을 반환한다(관례적으로 0 반환)
    //       vii. 필드 f가 배열이라면 배열의 각 요소를 별개의 필드처럼 처리 한다.
    //             그리고 2.b 수식을 적용하여 그 값들의 합을 구한다. (Strings 클래스의 구현된 hashCode 참조)
    //
    //    b. 앞의 2.a 단계에서 구한 해시 코드 c를 result 에 합계한다.
    //
    //        result = 31 * result + c
    //
    // 3. result 를 반환한다.
    // 4. hashCode 메소드 작성이 끝나면 동일한 인스턴스들이 같은 값의 해시 코드를 갖는지 검토하자.
    //    그리고 단위 테스트를 작성하여 잘 실행되는지 검증하자.
    //    만일 동일한 인스턴스들이 서로 다른 해시 코드 값을 갖는다면 그 이유를 찾아서 문제를 해결한다.
    //
    // 유의사항
    // - equals 메소드에서 비교하지 않은 필드른 제외시켜야 한다


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }
}
