import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ques_3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
        for(int i=5;i<11;i++){
            Runnable worker = new Factorial(i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");
    }
}
class Factorial implements Runnable{
    private int x;
    public Factorial(int num){
        this.x=num;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (START)");
        int ans = findFact(x);
        System.out.println("Factorial of "+x+" :"+ans);
        System.out.println(Thread.currentThread().getName()+" (END)");//prints thread name
    }
    private int findFact(int n) {
        return (n==1||n==0)?1:n*findFact(n-1);
    }
}
