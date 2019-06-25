package chapter33_use_enummap_instead_of_ordinal;

public class Usage_EnumMap_Phase {
    public static void main(String[] args) {

        System.out.println(Phase.from(Phase.LIQUID, Phase.GAS));
        //  output :    BOIL


        System.out.println(Phase.from(Phase.PLASMA, Phase.GAS));
        //  output :    DEIONIZE

        System.out.println(Phase.from(Phase.SOLID, Phase.PLASMA));
        //  output :    null

    }
}
