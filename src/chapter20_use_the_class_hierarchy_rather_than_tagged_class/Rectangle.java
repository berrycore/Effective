package chapter20_use_the_class_hierarchy_rather_than_tagged_class;

public class Rectangle extends Figure {

    final double length;
    final double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
