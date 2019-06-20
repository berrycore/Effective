package chapter30_enum_and_annotation;

public class Usage_PayrollDay {
    public static void main(String[] args) {
        System.out.println(PayrollDay.MONDAY.pay(10,2));
        System.out.println(PayrollDay.TUESEDAY.pay(10,2));
        System.out.println(PayrollDay.WEDNESDAY.pay(10,2));
        System.out.println(PayrollDay.THURSDAY.pay(10,2));
        System.out.println(PayrollDay.FRIDAY.pay(10,2));
        System.out.println(PayrollDay.SATURDAY.pay(10,2));
        System.out.println(PayrollDay.SUNDAY.pay(10,2));
    }
}
