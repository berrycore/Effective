import chapter1_creation_of_instance.DefaultProvider;
import chapter1_creation_of_instance.Provider;
import chapter1_creation_of_instance.Service;
import chapter1_creation_of_instance.Services;

public class Main {

    public static void main(String[] args) {


        Services.registerDefaultProvider(new DefaultProvider());

        Service service1 = Services.newInstance();
        service1.sendMessage("Hello send Message");


    }
}
