package practice;

import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static void main(String[] args) {
        ThreadB threadb = new ThreadB();
        for(int i=0;i<5;i++){
            new Thread(threadb,"线程"+i).start();
        }
        Thread threadMain = Thread.currentThread();
        System.out.println("这是主线程：");
        System.out.println("返回当前线程的线程组中活动线程的数目"+Thread.activeCount());
        System.out.println("主线程的名称："+threadMain.getName());
        System.out.println("返回主线程的标识符："+threadMain.getId());
        System.out.println("返回主线程的优先级："+threadMain.getPriority());
        System.out.println("返回主线程的状态："+threadMain.getState());
        System.out.println("返回该线程所属的线程组："+threadMain.getThreadGroup());
        System.out.println("测试该线程是否为守护线程："+threadMain.isDaemon());
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
