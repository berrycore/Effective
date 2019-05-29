package chapter20_use_the_class_hierarchy_rather_than_tagged_class;

public class Usage_Figure_class {

    public static void main(String[] args) {

        Figure circle = new Circle(5.2d);
        System.out.println(circle.area());      // 84.94866535306801

        Figure rectangle = new Rectangle(10,20);
        System.out.println(rectangle.area());   // 200.0

        Figure square = new Square(30);
        System.out.println(square.area());      // 900.0
    }
}
