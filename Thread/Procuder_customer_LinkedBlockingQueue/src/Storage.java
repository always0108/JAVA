import java.util.concurrent.LinkedBlockingQueue;

public class Storage {

    // 仓库存储的载体
    private LinkedBlockingQueue<Object> list = new LinkedBlockingQueue<>(30);

    /*put()或take()和System.out.println()输出不匹配的情况，这是由于它们之间没有同步造成的。
    BlockingQueue大家可以放心使用，这可不是它的问题，只是在它和别的对象之间的同步有问题。*/

    public void produce() {
        try{
            list.put(new Object());
            System.out.println("【生产者" + Thread.currentThread().getName()
                    + "】生产一个产品，现库存" + list.size());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void consume() {
        try{
            list.take();
            System.out.println("【消费者" + Thread.currentThread().getName()
                    + "】消费了一个产品，现库存" + list.size());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}