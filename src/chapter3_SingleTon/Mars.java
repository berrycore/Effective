package chapter3_SingleTon;

public class Mars {

    private static final Mars INSTANCE = new Mars();

    private String name = "Mars";
    private int typeCode;

    private Mars(){
        typeCode = 2;
    }

    public static Mars getInstance() {
        return INSTANCE;
    }

    public void turns(){
        System.out.println("The "+ getName() + " turns.");
    }

    public String getName(){
        return name;
    }

}
