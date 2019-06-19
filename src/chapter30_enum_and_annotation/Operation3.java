package chapter30_enum_and_annotation;

public enum Operation3 {

    PLUS ("+"){
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },

    MINUS ("-"){
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },

    TIMES ("*"){
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE ("/"){
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };


    private final String symbol;
    Operation3(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return symbol;
    }

    abstract double apply(double x, double y);
}
