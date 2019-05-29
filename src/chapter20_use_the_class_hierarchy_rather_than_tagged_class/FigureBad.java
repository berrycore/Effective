package chapter20_use_the_class_hierarchy_rather_than_tagged_class;

public class FigureBad {
    enum Shape { RECTANBLE, CIRCLE };

    final Shape shape;

    double length;
    double width;


    double radius;


    FigureBad(double radius){
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    FigureBad(double length, double width){
        shape = Shape.RECTANBLE;
        this.length = length;
        this.width = width;
    }

    double area(){
        switch (shape) {
            case RECTANBLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError();
        }
    }

}
