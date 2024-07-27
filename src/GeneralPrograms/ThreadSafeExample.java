package GeneralPrograms;
import java.util.concurrent.atomic.AtomicInteger;
class Counter1{
    //By using synchronized keyword we can achieve tread safety
    // int count;
//    public synchronized void increment(){
//        count++;
//    }
    //BY using Atomic keyword we can achieve thread safety
    AtomicInteger count = new AtomicInteger();
    public void increment(){
        count.incrementAndGet();
    }
}
public class ThreadSafeExample {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);

        //Note : Here we tried two ways to achieve thread safety by synchronized keyword and atomic keywords
        // and you will be able to see that it is giving constant output.
    }


}
