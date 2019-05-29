package chapter20_use_the_class_hierarchy_rather_than_tagged_class;

public class Circle extends Figure {

    final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
