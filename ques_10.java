public class ques_10 {
    public static void main(String[] args) {
        ques_10 q = new ques_10();
        for (long i = 0; i<1000; i++){
            q.add(i);
        }
    }
    public long add(long l){
        Long sum = 0L;
        sum=sum+1;
        return sum;
    }
}
// The memory leak here is due to the autoboxing in line 10;
//Instead of taking primitive long for the sum, I took the wrapper class.