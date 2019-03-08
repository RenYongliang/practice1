package practice;

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(eager1);
        System.out.println(eager2);
        System.out.println(lazy1==lazy2);
        System.out.println(eager1==eager2);
    }
}
