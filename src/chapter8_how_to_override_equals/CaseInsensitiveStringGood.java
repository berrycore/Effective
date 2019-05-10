package chapter8_how_to_override_equals;

public final class CaseInsensitiveStringGood {
    private final String s;

    public CaseInsensitiveStringGood(String s){
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof CaseInsensitiveStringGood) &&
               ((CaseInsensitiveStringGood)obj).s.equalsIgnoreCase(s);

        // 이하 생략
    }
}
