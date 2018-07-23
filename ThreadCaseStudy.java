import java.lang.Runnable;

class MyRunnable implements Runnable {
      public void run() {
        System.out.println("Child Thread");
      }
}

class ThreadCaseStudy {
      public static void main(String args[]) {
         MyRunnable r = new MyRunnable();
         Thread t1 = new Thread();
         Thread t2 = new Thread(r);

/* Case 1: If the following line is uncommented then a new thread will be created which will execute run method of Thread class,
   which has an empty implementation */

        // t1.start();

/* Case 2: If the following line is uncommented then a new thread will not be created  and run() method of Thread class
   will be executed like any normal method call */

        // t1.run();

/* Case 3: If the following line is uncommented then a new thread will be created which will execute run() method of MyRunnable
   class */

        // t2.start();

/* Case 4: If the following line is uncommented then a new thread will not be created and run() method of MyRunnable
   class will be executed like any normal method */

        // t2.run();

/* Case 5: If the following line is uncommented then a new thread will not be created and run() method of MyRunnable
   class will be executed like any normal method */

        //r.run();

/* Case 6: If the following line is uncommented then we will get a Compile time Error saying  error: cannot find symbol
        r.start();
         ^
  symbol:   method start()
  location: variable r of type MyRunnable  */

        // r.start();
 }
}
