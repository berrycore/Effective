package chapter30_enum_and_annotation;

public enum Operation2 {
    PLUS {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },

    MINUS {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },

    TIMES {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };

    abstract double apply(double x, double y);
}
