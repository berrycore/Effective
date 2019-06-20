package chapter30_enum_and_annotation;

public class Usage_Operation {
    public static void main(String[] args) {
        // 1) Operation
        double plus = Operation.PLUS.apply(100, 5);
        double minus = Operation.MINUS.apply(100,5);
        double times = Operation.TIMES.apply(100,5);
        double divide = Operation.DIVIDE.apply(100,5);

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(times);
        System.out.println(divide);

        // 2) Operation2
        double plus2 = Operation2.PLUS.apply(100,5);
        double minus2 = Operation2.MINUS.apply(100,5);
        double times2 = Operation2.TIMES.apply(100,5);
        double divide2 = Operation2.DIVIDE.apply(100,5);

        System.out.println(plus2);
        System.out.println(minus2);
        System.out.println(times2);
        System.out.println(divide2);

        // 3) Operation3
        for(Operation3 op3 : Operation3.values()){
            System.out.println(op3.apply(2,4));
        }
    }
}
