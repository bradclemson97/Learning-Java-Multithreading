package com.bradclemson97;

public class MultithreadThing implements Runnable{

    private int threadNumber;
    public MultithreadThing (int threadNumber) {
        //Threadnumber passed in from MultiThreading class
        this.threadNumber = threadNumber;
    }

    //Overriding the thread class' run method
    @Override
    public void run(){
        //Count up the numbers 1-5...
        for (int i = 1; i <= 5; i++){
            System.out.println(i + "from thread " +threadNumber);
            //If a thread throws up an exception it doesn't impact any of the other threads running concurrently
            if (threadNumber ==3) {
                throw new RuntimeException();
            }
            //Make it sleep for 1 second between each number...
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
