import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {

    // 仓库最大存储量
    private final int MAX_SIZE = 100;

    // 仓库存储的载体
    private LinkedList<Object> list = new LinkedList<Object>();

    // 锁
    private final Lock lock = new ReentrantLock();

    // 仓库满的条件变量
    private final Condition full = lock.newCondition();

    // 仓库空的条件变量
    private final Condition empty = lock.newCondition();

    // 生产num个产品
    public void produce(int num,String name)
    {
        // 获得锁
        lock.lock();
        int old = list.size();
        // 如果仓库剩余容量不足
        while (list.size() + num > MAX_SIZE) {
            int free = MAX_SIZE - list.size();
            System.out.println("【生产者 " + name + "】 订单的产品数量:" + num + " 剩余空间:"
                    +  free + " 暂时不能生产");
            try {
                full.await();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= num; ++i) {
            list.add(new Object());
        }
        System.out.println("【生产者 " + name + "】 原库存量：" + old + " 生产的产品数量:"
                + num + " 现库存量:" + list.size() + " 订单生产完成");
        // 唤醒其他所有线程、释放锁
        full.signalAll();
        empty.signalAll();
        lock.unlock();
    }

    // 消费num个产品
    public void consume(int num , String name)
    {
        // 获得锁
        lock.lock();
        int old = list.size();
        // 如果仓库存储量不足
        while (list.size() < num) {
            System.out.println("【消费者 " + name + "】 库存量：" + old + " 需要的产品数量:"
                    + num + " 暂时不能提货");
            try {
                empty.await();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= num; ++i) {
            list.remove();
        }
        System.out.println("【消费者 " + name + "】 原库存量：" + old + " 取走的产品数量:"
                + num + " 现库存量:" + list.size() + " 提货完成");
        // 唤醒其他所有线程、释放锁
        full.signalAll();
        empty.signalAll();
        lock.unlock();
    }
}
