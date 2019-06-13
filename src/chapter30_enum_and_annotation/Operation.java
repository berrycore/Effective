package chapter30_enum_and_annotation;

public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    double apply(double x, double y){
        switch(this){
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }

        throw new AssertionError("Unknown op: " + this);
    }
}
