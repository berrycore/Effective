package chapter3_SingleTon;

public class Earth {

    public static final Earth INSTANCE = new Earth();

    private String name = "Earth";
    private int typeCode;

    private Earth(){
        typeCode = 1;
    }

    public void turns(){
        System.out.println("The "+ getName() + " turns.");
    }

    public String getName(){
        return name;
    }
}
