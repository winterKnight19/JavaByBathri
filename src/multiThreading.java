public class multiThreading extends Thread {
    public void run(){

        try {
//            if (Thread.currentThread().getName() != "Thread2") {

                Thread.sleep(500);
                //          }
        }
        catch (InterruptedException e){

        }
        for(int i = 0;i <=5;i++){
            System.out.println("the thread " +Thread.currentThread().getName() +" is running the value is "+i);
        }

        System.out.println("the current thead that iiss alive is "+Thread.currentThread().isAlive());
    }
    public static void main(String[] args) {
        multiThreading m1 = new multiThreading();
        multiThreading m2 = new multiThreading();
        multiThreading m3 = new multiThreading();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
//        t1.setName("Thread1");
//        t2.setName("Thread2");
//        t3.setName("Thread3");
        System.out.println("t1 thread priority : " + t1.getPriority());
        System.out.println("t1 thread priority : " + t2.getPriority());
        System.out.println("t1 thread priority : " + t3.getPriority());
        t3.setPriority(MAX_PRIORITY);
        System.out.println("t1 thread priority : " + t3.getPriority());
        t1.start();
        t2.start();
        t3.start();

    }
}