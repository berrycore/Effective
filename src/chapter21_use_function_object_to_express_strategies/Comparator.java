package chapter21_use_function_object_to_express_strategies;

public interface Comparator<T> {
    int compare(T t1, T t2);
}
