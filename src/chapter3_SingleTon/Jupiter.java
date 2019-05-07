package chapter3_SingleTon;

public enum Jupiter {

    INSTANCE;

    private String name = "Jupiter";
    private int typeCode;

    private Jupiter(){
        typeCode = 3;
    }


    public void turns(){
        System.out.println("The "+ getName() + " turns.");
    }

    public String getName(){
        return name;
    }

}
