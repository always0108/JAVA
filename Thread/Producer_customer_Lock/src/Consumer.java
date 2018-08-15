

public class Consumer implements Runnable{

    private Storage storage;
    private String name;

    public Consumer(){}

    public Consumer(Storage storage , String name){
        this.storage = storage;
        this.name = name;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(2000);
                storage.consume(name);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
