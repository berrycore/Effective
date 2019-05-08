package chapter5_immutable_instance;

import java.util.Date;

public class Usage_static_initialize {

    //TODO :
    public static void main(String[] args) {

        PersonBad personBad = new PersonBad(new Date());
        System.out.println(personBad.isBabyBoomer());

        PersonGood personGood = new PersonGood(new Date());
        System.out.println(personGood.isBabyBoomer());
    }
}
