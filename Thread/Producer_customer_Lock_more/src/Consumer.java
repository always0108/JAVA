

public class Consumer implements Runnable{

    private Storage storage;
    private int num;
    private String name;

    public Consumer(){}

    public Consumer(Storage storage, int num, String name){
        this.storage = storage;
        this.num = num;
        this.name = name;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                storage.consume(num,name);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
