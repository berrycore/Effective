package chapter30_enum_and_annotation;

public class WeightTable {

    public static void main(String[] args) {

        String weight = "175";

        double earthWeight = Double.parseDouble(weight);
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for( Planet p : Planet.values()){
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}
