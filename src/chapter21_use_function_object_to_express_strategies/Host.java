package chapter21_use_function_object_to_express_strategies;

import java.io.Serializable;

public class Host {

    private Host(){}

    private static class StrLenCmp implements Comparator<String>, Serializable{
        @Override
        public int compare(String t1, String t2) {
            return t1.length() - t2.length();
        }
    }

    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();

    // Host.STRING_LENGTH_COMPARATOR.compare(String t1, String t2)
}