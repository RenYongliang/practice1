package practice;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Count {

    final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    public void get(){
        rwl.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+"get begin");
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"get end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            rwl.readLock().unlock();
        }

    }


    public void put(){
        rwl.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+"put begin");
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"put end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            rwl.writeLock().unlock();
        }
    }
}
