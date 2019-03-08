package practice;

public class ThreadInterruptDemo implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadInterruptDemo(),"InterruptDemo Thread");
        System.out.println("starting thread...");
        thread.start();
        Thread.sleep(3000);
        System.out.println("Interrupting thread...");
        thread.interrupt();
        System.out.println("线程是否中断："+thread.isInterrupted());
        Thread.sleep(3000);
        System.out.println("stopping application...");

    }
    @Override
    public void run() {
        boolean stop = false;
        while(!stop){
            System.out.println("My Thread is running...");
            long time = System.currentTimeMillis();
            while(System.currentTimeMillis()-time<1000){
                //
            }
            if(Thread.currentThread().isInterrupted()){
                break;
            }
        }
        System.out.println("My Thread exiting under request...");
    }
}
