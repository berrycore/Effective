package chapter11_how_to_override_clone;

public class PhoneNumber implements Cloneable {

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

        if(!(obj instanceof  PhoneNumber )){    // 2. 인스턴스 확인
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

