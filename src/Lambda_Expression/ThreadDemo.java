package Lambda_Expression;

public class ThreadDemo {
    public static void main(String[] args) {
        //First Thread : Thread - JOHN
        Runnable thread = () -> {
            //THis is body of thread
            for(int i = 0; i < 10; i++) {
                System.out.println("value of i is "+ i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread1 = new Thread(thread);
        thread1.setName("JOHN");
        thread1.start();

        //Second Thread : Table of 2
        Runnable thread2 = () ->{
            for(int i = 1; i < 11; i++) {
                int i1 = 2 * i;
                System.out.println("2 x "+i+"="+ i1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread3 = new Thread(thread2);
        thread3.start();

    }
}
