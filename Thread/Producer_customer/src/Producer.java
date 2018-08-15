public class Producer implements Runnable{
    private Storage storage;
    private String name;

    public Producer(){}

    public Producer(Storage storage , String name){
        this.storage = storage;
        this.name = name;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(100);
                storage.produce(name);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
