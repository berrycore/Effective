package chapter12_consider_Comparable;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber){

        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999,"prefix");
        rangeCheck(lineNumber, 9999, "line number");

        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }


    private static void rangeCheck(int arg, int max, String name) {
        if(arg < 0 || arg > max){
            throw new IllegalArgumentException(name +" : " + arg);
        }
    }

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
    @Override
    public int compareTo(PhoneNumber pn){
        int areaCodeDiff = areaCode - pn.areaCode;
        if(areaCodeDiff != 0)
            return areaCodeDiff;

        int prefixDiff = prefix - pn.prefix;
        if(prefixDiff != 0)
            return prefixDiff;

        return lineNumber - pn.lineNumber;
    }

//    @Override
//    public int compareTo(PhoneNumber pn) {
//        if(areaCode < pn.areaCode)
//            return -1;
//        if(areaCode > pn.areaCode)
//            return 1;
//
//        if(prefix < pn.prefix)
//            return -1;
//        if(prefix > pn.prefix)
//            return 1;
//
//        if(lineNumber < pn.lineNumber)
//            return -1;
//        if(lineNumber > pn.lineNumber)
//            return 1;
//
//        return 0;
//    }


    /*
    *  일반적인 clone 규약
    *
    *  1) x.clone() != x                       는 true 가 될 것이다.
    *
    *  2) x.clone.getClass() == x.getClass()   도 true 가 될 것이다.
    *
    *  3) x.clone().equals(x)                  도 true 가 될 것이다.
    *
    *  하지만 필수 요건은 아니다.
    *
    *  유의점!!! 어떤 생성자도 호출되지 않고 new 없이 객체가 생성되어 복제되기 때문에 사용에 주의가 필요하다,
    *
    * */
    /**
     *  PhoneNumber 클래스는 모든 멤버필드가 기본형 데이타 값이나 불변 객체 참조만을 갖고 있기 때문에
     *  Object 클래스의 protected clone 메소드를 public 으로 오버라이딩 하면 된다.
     *  리턴 타입은 PhoneNumber 으로 명시하고 super.clone() 을 호출한 후 (PhoneNumber) 으로 casting 한다.
     * */
    @Override
    public PhoneNumber clone() {
        try{
            return (PhoneNumber) super.clone();
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }


    /**
     * (지역번호)  국번호 - 내선번호
     * (areaCode) prefix - lineNumber
     *
     * */
    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
    }

    @Override
    public boolean equals(Object obj) {

        if( obj == this){                       // 1. 자기 자신 확인
            return true;
        }

        if(!(obj instanceof PhoneNumber)){    // 2. 인스턴스 확인
            return false;
        }

        PhoneNumber pn = (PhoneNumber) obj;     // 3. 같으면 casting


        return pn.lineNumber == this.lineNumber
                && pn.prefix == this.prefix
                && pn.areaCode == this.areaCode;  // 4. 멤머필드 3개 값 모두 같은지 확인
    }


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

}

