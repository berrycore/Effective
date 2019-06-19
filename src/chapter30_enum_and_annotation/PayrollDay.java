package chapter30_enum_and_annotation;

//*
// Strategy enum pattern
//
// */
public enum PayrollDay {
    MONDAY(PayType.WEEKDAY),


    private final PayType payType;

    PayrollDay(PayType payType){
        this.payType = payType;
    }

    double pay(double hoursWorked, double payRate){
        return payType.pay()
    }


    private enum PayType{








    }
}
