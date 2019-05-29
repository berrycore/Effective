package chapter20_use_the_class_hierarchy_rather_than_tagged_class;

public class Square extends Rectangle {

    Square(double side) {
        super(side, side);
    }

    @Override
    double area() {
        return super.area();
    }
}
