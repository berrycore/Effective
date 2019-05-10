package chapter8_how_to_override_equals;

import java.awt.*;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color){
        super(x,y);
        this.color = color;
    }

    void printRGB(){
        System.out.println(color.toString());
    }
}
