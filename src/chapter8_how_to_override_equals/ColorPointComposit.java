package chapter8_how_to_override_equals;

import java.awt.*;

public class ColorPointComposit {

    private final Point point;
    private final Color color;

    public ColorPointComposit(int x, int y, Color color){
        if (color == null) {
            throw new NullPointerException();
        }

        point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }


    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof ColorPointComposit)) {
            return false;
        }

        ColorPointComposit cp = (ColorPointComposit) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
