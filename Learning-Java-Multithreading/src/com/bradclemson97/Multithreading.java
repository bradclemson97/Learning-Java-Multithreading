package com.bradclemson97;

/* Multithreading is the ability to execute multiple different paths of code at the same time
   There are two main ways of creating a new thread:
   1. One class which extends the thread class
   2. Implement the runnable interface - the only thing you have to do is have your own implementation of the .run method
      - this is preferred because, using option one, we can only extend one class and no others. Using option two, we can still extend another class and there is no
      limit on interfaces we can implement.
 */

public class Multithreading {

    public static void main(String[] args) {

        //With this for loop we will create and start 5 threads
        for (int i = 0; i < 5; i++){
            //Create an object for the MultithreadThing class and pass in a number identifying the thread
            MultithreadThing myThing = new MultithreadThing(i);
            //With extending thread we would call .start, Java will branch off from the code and run each thread at the same time - multiple concurrent threads
            //Otherwise with implementing the runnable interface, we need to pass in the object which implements in the runnable interface (myThread)
            Thread myThread = new Thread(myThing);
            myThread.start();
            //Returns a boolean for if the thread is still running 
            myThread.isAlive();
        }

    }
}
