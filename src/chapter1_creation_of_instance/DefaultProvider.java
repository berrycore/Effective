package chapter1_creation_of_instance;

public class DefaultProvider  implements  Provider{

    private Service defaultService;

    @Override
    public Service newService() {
        return getDefaultService();
    }


    private Service getDefaultService() {
        if (defaultService == null){
            return new DefaultService();
        }else{
            return this.defaultService;
        }
    }
}
