package Thread;

public class Count {
    public int num = 0;
    public void add(){
        synchronized(this) {
            try {
                Thread.sleep(5l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num += 1;
        }
        try {
            Thread.sleep(1l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"-"+num);
    }
}
