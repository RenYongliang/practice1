package practice;

public class Case implements Runnable{

    private static volatile int n = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(5l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        n++;
        Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getName()+",  n="+n);
    }

    public static void main(String[] args) throws InterruptedException {
        Case c = new Case();
        for(int i=0;i<10;i++){
            Thread th = new Thread(c);
            th.start();
        }
        Thread.sleep(10l);
        System.out.println(n);
    }
}
