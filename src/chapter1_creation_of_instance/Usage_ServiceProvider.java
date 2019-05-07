package chapter1_creation_of_instance;

import chapter1_creation_of_instance.DefaultProvider;
import chapter1_creation_of_instance.Provider;
import chapter1_creation_of_instance.Service;
import chapter1_creation_of_instance.Services;

public class Usage_ServiceProvider {

    public static void main(String[] args) {


        Services.registerDefaultProvider(new DefaultProvider());

        Service myService = Services.newInstance();
        myService.sendMessage("Hello send Message");
        myService.rejectMessage("Reject !!!");

    }
}
