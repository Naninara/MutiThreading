public class JoinMethod {
    public static void main(String[] args) throws Exception{
        mythread t1 = new mythread(5000);
        mythread t2 = new mythread(7000);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t1.val+t2.val);
    }
    private static class mythread extends Thread{
        int val;
        int sleep;
        public mythread(int sleep){
            this.val = val;
            this.sleep = sleep;
        }

        @Override
        public void run() {
            //System.out.println("the value in this thread is: "+val );
            try {
                Thread.sleep(sleep);
                this.val = 50;
                System.out.println("the value in this thread is: "+val );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
