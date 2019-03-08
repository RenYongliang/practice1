package practice;

import java.util.concurrent.Callable;

public class CallTest implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(500L);
        System.out.println("这是线程B");
        return "thread B";
    }
}
