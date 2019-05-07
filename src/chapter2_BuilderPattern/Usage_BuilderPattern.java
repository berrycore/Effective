package chapter2_BuilderPattern;

public class Usage_BuilderPattern {

    public static void main(String[] args) {

        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).
                calories(100).fat(10).sodium(35).carbohydrate(27).build();

        System.out.println(cocaCola.toString());



        NutritionFacts spride = new NutritionFacts.Builder(240,7).fat(1).build();
        System.out.println(spride.toString());
    }
}
