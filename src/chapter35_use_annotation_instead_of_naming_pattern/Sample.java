package chapter35_use_annotation_instead_of_naming_pattern;

public class Sample {
    @Test
    public static void m1(){} //테스트 성공 해야 함

    public static void m2(){}

    @Test
    public static void m3(){
        throw new RuntimeException("Boom");
    } // 테스트 실패 해야 함


    public static void m4(){}

    @Test
    public void m5(){}  // 잘못된 사용 : static 메소드가 아님

    public static void m6(){}

    @Test
    public static void m7(){
        throw new RuntimeException("Crash");
    } // 테스트 실패 해야 함


    public static void m8(){}

}
