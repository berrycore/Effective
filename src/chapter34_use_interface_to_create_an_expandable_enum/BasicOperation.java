package chapter34_use_interface_to_create_an_expandable_enum;

public enum BasicOperation implements Operation {

    PLUS("+"){
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-"){
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*"){
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/"){
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };


    private String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
