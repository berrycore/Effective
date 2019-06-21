package chapter32_use_enumset_without_bit_field;

public class Text_Old {
    public static final int STYLE_BOLD = 1 << 0;    // 1
    public static final int STYLE_ITALIC = 1 << 1;  // 2
    public static final int STYLE_UNDERLINE = 1 << 2; //4
    public static final int STYLE_STRIKETHROUGH = 1 << 3; //8

    public void applyStyles(int styles){
        // something code
    }




}
