package chapter1_creation_of_instance;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    // static 으로만 구성된 클래스, 인스턴스 생성을 막음
    private Services(){}

    // 서비스명을 Map 에 보존함.
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }


    // Provider 를 등록하는 API
    public static void registerProvider(String name, Provider p){
        providers.put(name, p);
    }

    // 서비스 접근 API
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name){
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name : " + name);
        }
        return p.newService();
    }

}
