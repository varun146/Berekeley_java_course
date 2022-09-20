package threading;

public class MultithreadThing extends Thread{

    private int threadNumber;
    MultithreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }


    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }
}
