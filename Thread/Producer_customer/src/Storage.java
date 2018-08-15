import java.util.LinkedList;

public class Storage {
    // 仓库容量
    private final int MAX_SIZE = 30;

    // 仓库存储的载体
    private LinkedList<Object> list = new LinkedList<>();

    public void produce(String name) {
        synchronized (list) {
            while (list.size() + 1 > MAX_SIZE) {
                System.out.println("【生产者" + name + "】仓库已满");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(new Object());
            System.out.println("【生产者" + name + "】生产一个产品，现库存" + list.size());
            list.notifyAll();
        }
    }

    public void consume(String name) {
        synchronized (list) {
            while (list.size() == 0) {
                System.out.println("【消费者" + name + "】仓库为空");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove();
            System.out.println("【消费者" + name + "】消费一个产品，现库存" + list.size());
            list.notifyAll();
        }
    }
}