package chapter10_how_to_override_toString;

public class PhoneNumber {
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
