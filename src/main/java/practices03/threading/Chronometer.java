package practices03.threading;

public class Chronometer implements Runnable{

    private Thread thread;
    private String threadName;

    public Chronometer(String threadName){
        this.threadName = threadName;
        System.out.println("being created : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("being run : " + threadName);
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(threadName + " : " + i);
                    Thread.sleep(1000);//it means print and wait for a second, write and wait for a second
                }
                }catch(InterruptedException e){
                    System.out.println("interrupted : " + threadName + " --> " + e.getMessage());
                    }
        System.out.println("thread is ended " + threadName);
            }


            public void start(){
                System.out.println("thread object is being created");
                if(thread == null){
                    thread = new Thread(this,threadName);
                    thread.start();
                }
            }



 }

