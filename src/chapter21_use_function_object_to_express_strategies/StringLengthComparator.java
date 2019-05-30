package chapter21_use_function_object_to_express_strategies;

public class StringLengthComparator implements Comparator<String>{

    private StringLengthComparator(){ }

    public static final StringLengthComparator INSTANCE = new StringLengthComparator();


    @Override
    public int compare(String t1, String t2) {
        //strategy
        return t1.length() - t2.length();
    }
}
