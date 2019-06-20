package chapter31_use_instance_field_instead_of_ordinal;

public enum Ensemble_Bad {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET,
    OCTET, NONET, DECTET;


    // Do not use ordinal()
    public int numberOfMusicians(){
        return ordinal() +1;
    }
}
