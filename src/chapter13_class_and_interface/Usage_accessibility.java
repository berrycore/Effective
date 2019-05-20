package chapter13_class_and_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Usage_accessibility {

    // 1)  a bad example
    //     Do not use public at member fields
    public static final Point[] VALUES = {new Point(10, 14), new Point(5, 9)};


    // 2) modify as follows
    private static final Point[] POINTS = {new Point(10, 14), new Point(5, 9)};
    public static final List<Point> POINT_LIST = Collections.unmodifiableList(Arrays.asList(POINTS));


    // 3) or consider clone();
    private static final Point[] PRIVATE_POINTS = {new Point(888, 777), new Point(555, 333)};
    public static final Point[] values(){
        return PRIVATE_POINTS.clone();
    }


    public static void main(String[] args) {

        // 2) Collections.unmodifiableList(Arrays.asList(POINTS)); - read only
        System.out.println("Collections.unmodifiableList(Arrays.asList(POINTS)); - read only");
        for(Point point : POINT_LIST){
            System.out.println("getX() : " + point.getX() + " , getY() : " + point.getY());
        }


        // 3)  or consider clone();
        System.out.println("return PRIVATE_POINTS.clone();");
        for(Point point : values()){
            System.out.println("getX() : " + point.getX() + " , getY() : " + point.getY());
        }
    }
}
