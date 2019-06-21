package chapter33_use_enummap_instead_of_ordinal;

import java.util.HashSet;
import java.util.Set;

public class Usage_EnumMap {
    public static void main(String[] args) {

        Herb[] garden = new Herb[5];
        garden[0] = new Herb("herb_1", Herb.Type.ANNUAL);
        garden[1] = new Herb("herb_2", Herb.Type.BIENNIAL);
        garden[2] = new Herb("herb_3", Herb.Type.PERENNIAL);
        garden[3] = new Herb("herb_4", Herb.Type.ANNUAL);
        garden[4] = new Herb("herb_5", Herb.Type.ANNUAL);


        Set<Herb>[] herbsByType = (Set<Herb>[]) new Set[Herb.Type.values().length];

        for (int i = 0; i < herbsByType.length; i++) {
            herbsByType[i] = new HashSet<Herb>();
        }


        for (int i = 0; i < herbsByType.length; i++) {
            System.out.printf("%s: %s%n", Herb.Type.values()[i], herbsByType[i]);
        }
    }
}
