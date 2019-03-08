package Reflector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Fruit f;
    public MyInvocationHandler(Fruit f) {
        this.f = f;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        Object obj = method.invoke(f,args);
        System.out.println("日志记录");
        return obj;
    }
}
