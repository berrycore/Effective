package chapter1_creation_of_instance;

public class DefaultService implements  Service{

    @Override
    public boolean sendMessage(String s) {
        System.out.println("send Message : " + s);
        return true;
    }

    @Override
    public boolean rejectMessage(String s) {
        System.out.println("rejectMessage : " + s);
        return true;
    }
}
