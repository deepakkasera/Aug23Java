public class RunnableDemo {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Runnable runnable = () -> {
            //Here the code for run() method will come.
            System.out.println(Thread.currentThread().getName());
        };
        Thread t = new Thread(runnable);
        //t.start();


        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        t1.start();
    }
}
