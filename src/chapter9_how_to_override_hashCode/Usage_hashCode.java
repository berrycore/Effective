package chapter9_how_to_override_hashCode;

import java.util.HashMap;
import java.util.Map;

public class Usage_hashCode {

    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<PhoneNumber, String>();

        map.put(new PhoneNumber(707, 867, 5309), "Jenny");
        System.out.println(map.get(new PhoneNumber(707, 867, 5309)));
        // return value : Jenny

        Map<PhoneNumberBad, String> mapBad = new HashMap<PhoneNumberBad, String>();
        mapBad.put(new PhoneNumberBad(707, 907, 5555), "Mike");
        System.out.println(mapBad.get(new PhoneNumberBad(707,907,5555)));
        // return value : null



        String name = "1";
        System.out.println(name.hashCode());    // ascii code : 1 is 49

        String name2 = "a";
        System.out.println(name2.hashCode());   // ascii code : a is 97

        String name3 = "12";
        System.out.println(name3.hashCode());   // ascii code : 1 is 49, ascii code : 2 is 50
        //              h = 31 * h + val[i];
        //          1)  h = 31 * 0 + 49
        //          2)  h = 31 * 49 + 50
        //          3)  h = 1569
    }
}
