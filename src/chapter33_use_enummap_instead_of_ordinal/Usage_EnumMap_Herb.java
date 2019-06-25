package chapter33_use_enummap_instead_of_ordinal;

import java.util.*;

public class Usage_EnumMap_Herb {
    public static void main(String[] args) {

        Herb[] garden = new Herb[5];
        garden[0] = new Herb("herb_1", Herb.Type.ANNUAL);
        garden[1] = new Herb("herb_2", Herb.Type.BIENNIAL);
        garden[2] = new Herb("herb_3", Herb.Type.PERENNIAL);
        garden[3] = new Herb("herb_4", Herb.Type.ANNUAL);
        garden[4] = new Herb("herb_5", Herb.Type.ANNUAL);

        /*
        Set<Herb>[] herbsByType = (Set<Herb>[]) new Set[Herb.Type.values().length];

        for (int i = 0; i < herbsByType.length; i++) {
            herbsByType[i] = new HashSet<Herb>();
        }

        for (int i = 0; i < herbsByType.length; i++) {
            System.out.printf("%s: %s%n", Herb.Type.values()[i], herbsByType[i]);
        }
        */

        Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<Herb.Type, Set<Herb>>(Herb.Type.class);


        for(Herb.Type t : Herb.Type.values()){
            herbsByType.put(t, new HashSet<Herb>());
        }

        for(Herb h : garden){
            herbsByType.get(h.getType()).add(h);
        }

        System.out.println(herbsByType);
        // {ANNUAL=[herb_4, herb_1, herb_5], PERENNIAL=[herb_3], BIENNIAL=[herb_2]}

    }
}
