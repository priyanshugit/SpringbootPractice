package GeneralPrograms;
class Counter{
    int count ;
    public void increment(){
        count++;
    }
}
public class NonThreadSafeExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

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

        //Note : when we run this program every time we get new value, because multiple threads
        //are accessing the same shared resource(Class counter) which is updating the value of count.
        //so that means this is not thread Safe
    }
}
