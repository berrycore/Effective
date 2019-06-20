package chapter31_use_instance_field_instead_of_ordinal;

public enum Ensemble_Good {

    SOLO(1), DUET(2), TRIO(3), QUARTET(4),
    QUINTET(5), SEXTET(6), SEPTET(7),
    OCTET(8), NONET(9), DECTET(10);




    private final int numberOfMusicians;

    Ensemble_Good(int size){
        this.numberOfMusicians = size;
    }

    public int numberOfMusicians(){
        return numberOfMusicians;
    }
}
