package chapter21_use_function_object_to_express_strategies;


public class Usage_strategy {

    public static void main(String[] args) {

        String lion = "lion";
        String tiger = "tiger";

        int result = Host.STRING_LENGTH_COMPARATOR.compare(lion, tiger);
        System.out.println( result );   // -1


    }

}
