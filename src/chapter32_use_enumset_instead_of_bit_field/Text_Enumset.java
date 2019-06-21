package chapter32_use_enumset_instead_of_bit_field;

import java.util.Set;

public class Text_Enumset {
    public enum Style{ BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    public void applyStyles(Set<Style> styles){
        // something code
    }
}
