package practice;

import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class SS {

    private static volatile SS instance;
    private SS(){}

    public static SS getInstance(){
        if(instance!=null){
            synchronized (SS.class){
                if(instance!=null){
                    instance = new SS();
                }
            }
        }
        TreeMap tr = new TreeMap();
        ConcurrentHashMap chm = new ConcurrentHashMap();
        return instance;
    }

}
