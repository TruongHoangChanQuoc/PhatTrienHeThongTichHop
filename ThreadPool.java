import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadPool implements Runnable {
    private String message;

    public ThreadPool(String s){
        this.message = s;
    }

    
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }

    private void processMessage(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // tao 1 pool chua 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i = 0; i<10; i++){
            Runnable worker = new ThreadPool("" + i);
            //gọi phương thức execute của ExecutorService
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()){

        }
        System.out.println("Finish all threads");
    }
}