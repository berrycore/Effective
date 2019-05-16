package chapter9_how_to_override_hashCode;

public class PhoneNumberBad {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumberBad(int areaCode, int prefix, int lineNumber){

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

        if(!(obj instanceof  PhoneNumberBad )){    // 2. 인스턴스 확인
            return false;
        }

        PhoneNumberBad pnb = (PhoneNumberBad) obj;     // 3. 같으면 casting


        return pnb.lineNumber == this.lineNumber
                && pnb.prefix == this.prefix
                && pnb.areaCode == this.areaCode;  // 4. 멤머필드 3개 값 모두 같은지 확인
    }

    // hashCode method not implemented

}
