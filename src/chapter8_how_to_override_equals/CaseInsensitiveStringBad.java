package chapter8_how_to_override_equals;

public final class CaseInsensitiveStringBad {
    private final String s;

    public CaseInsensitiveStringBad(String s){
        if(s == null){
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof CaseInsensitiveStringBad) {
            return s.equalsIgnoreCase(((CaseInsensitiveStringBad) obj).s);
        }
        if( obj instanceof String){
            return s.equalsIgnoreCase((String)obj);
        }
        // 이하 생략

        return false;
    }
}
