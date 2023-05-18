public class SynchronizedMain {
    public static void main(String[] args) {
        SynchronizedClassEx ex = new SynchronizedClassEx("mavin","nara");
        SynchronizedClassEx ex2 = new SynchronizedClassEx("manikanta","nnn");

        sthread t1 = new sthread(ex);
        sthread t2 = new sthread(ex);
        sthread t3 = new sthread(ex2);
        sthread t4 = new sthread(ex2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    public static class sthread extends Thread{
        SynchronizedClassEx example;

        sthread(SynchronizedClassEx data){
            this.example = data;
        }
        @Override
        public void run() {
            synchronized (SynchronizedClassEx.class) {
                System.out.println("running thread is " + currentThread().getName() + " object refernce is " + example);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
