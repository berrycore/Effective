package chapter33_use_enummap_instead_of_ordinal;

public class Herb {
    public enum Type { ANNUAL, PERENNIAL, BIENNIAL }

    private final String name;
    private final Type type;

    Herb(String name, Type type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString(){
        return name;
    }
}
