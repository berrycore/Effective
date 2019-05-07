package chapter3_SingleTon;

public class Usage_SingleTon {


    public static void main(String[] args) {

        // Usage 1
        Earth earth = Earth.INSTANCE;
        earth.turns();


        // Usage 2
        Mars mars = Mars.getInstance();
        mars.turns();


        // Usage 3
        Jupiter jupiter = Jupiter.INSTANCE;
        jupiter.turns();

    }

}
