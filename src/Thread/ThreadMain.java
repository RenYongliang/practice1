package Thread;

public class ThreadMain {

    public static void main(String[] args) {
        Count count = new Count();
        for(int i=0;i<5;i++){
            ThreadA task = new ThreadA(count);
            task.start();
        }
        try {
            Thread.sleep(100l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("5个人干完活最后的值："+ count.num);
    }
}
