import java.util.ArrayList;
import java.util.List;

public class ques_7 extends Thread {
    List<Integer> al = new ArrayList<>();

    public void run(){
        System.out.println(Thread.currentThread().getName()+" (START)");
        al.add(3);
        System.out.println(Thread.currentThread().getName()+" (END)");
    }
    public static void main(String[] args) {
        try{
            for(int i=0;i<3;i++){
                ques_7 thread =  new ques_7();
                thread.start();
                thread.join();
            }
        }catch(Exception e){ System.out.println(e); }


    }

}
