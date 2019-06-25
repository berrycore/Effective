package chapter34_use_interface_to_create_an_expandable_enum;


import java.util.ArrayList;
import java.util.List;

public class Usage_Operation {
    public static void main(String[] args) {

        test(10,3);

    }

    static void test(double x, double y){
        List<Operation> opList = new ArrayList<Operation>();
        opList.add(BasicOperation.PLUS);
        opList.add(BasicOperation.MINUS);
        opList.add(BasicOperation.TIMES);
        opList.add(BasicOperation.DIVIDE);
        opList.add(ExtendedOperation.EXP);
        opList.add(ExtendedOperation.REMAINDER);

        for(Operation op : opList){
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x,y));
        }
    }
}
