package chapter32_use_enumset_without_bit_field;

import java.util.EnumSet;

import static chapter32_use_enumset_without_bit_field.Text_Old.*;
import static chapter32_use_enumset_without_bit_field.Text_Enumset.Style;

public class Usage_enumset {
    public static void main(String[] args) {
        Text_Old text = new Text_Old();
        text.applyStyles( STYLE_BOLD | STYLE_ITALIC );

        Text_Enumset text2 = new Text_Enumset();
        text2.applyStyles(EnumSet.of( Style.BOLD, Style.ITALIC));
    }
}
