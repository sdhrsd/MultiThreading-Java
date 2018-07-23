/* Threads can be defined in two ways - By extending Thread class and by implementing runnable interface */

// 1. By extending Thread class Demo

class MyThread extends Thread {   // The job of thread is the code in run part
    public void run() {
        for(int i = 0; i<10; i++) {
        System.out.println("Child Thread");  // This for loop is executed by ChildThread.
        }
    }
}

class ExtendThreadClassDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // This is thread instantiation.
        t.start();                 // Main thread is responsible for creating child thread and also for starting it.
        for(int i = 0; i<10; i++) {  // This for loop is executed by Main Thread.
        System.out.println("Main Thread");
        }
    }
}

/* The output of this program cannot be predicted because both the threads run simultaneously */
