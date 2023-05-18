public class Main {
    public static void main(String[] args) {
        Mythead t1 = new Mythead();
        //t1.setDaemon(true);  //program doesnt wait till the t1 exexutes fully
        t1.start();
    }

}
class Mythead extends Thread{
    @Override
    public void run() {
        System.out.println("thread running is"+currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}