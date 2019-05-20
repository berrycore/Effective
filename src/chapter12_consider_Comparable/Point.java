package chapter12_consider_Comparable;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof chapter8_how_to_override_equals.Point)){
            return false;
        }

        Point p = (Point)obj;
        return (p.x == this.x) && (p.y == this.y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
