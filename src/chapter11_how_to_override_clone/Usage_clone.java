package chapter11_how_to_override_clone;

public class Usage_clone {
    public static void main(String[] args) {

        PhoneNumber pn_origin = new PhoneNumber(031,333,4444);
        PhoneNumber pn_cloned = pn_origin.clone();

        System.out.println(pn_origin);
        System.out.println(pn_cloned);

        System.out.println( pn_origin != pn_cloned);                        // true
        System.out.println( pn_origin.getClass() == pn_cloned.getClass());  // true
        System.out.println( pn_origin.equals(pn_cloned));                   // true
    }
}
