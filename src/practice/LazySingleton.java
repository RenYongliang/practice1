package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
            Map map = new HashMap<>();
            Map map2 = new ConcurrentHashMap();
        }
        return instance;
    }


}
