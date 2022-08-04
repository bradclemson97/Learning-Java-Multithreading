# Learning-Java-Multithreading

Multithreading is the ability to execute multiple different paths of code at the same time.

There are two main ways of creating a new thread:
1. One class which extends the thread class.
2. Implement the runnable interface - the only thing you have to do is have your own implementation of the .run method.
   - this is preferred because, using option one, our main class can only extend one class and no others. Using option two, we can still extend another class and there is no limit on interfaces we can implement.
