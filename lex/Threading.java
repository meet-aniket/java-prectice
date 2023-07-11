package lex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Docs:-
 * 
 */

/**
 * Main executor class.
 */
public class Threading {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        RunnableClass runnableClass = new RunnableClass();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(threadClass);
        executor.execute(runnableClass);
    }
}

/**
 * Creating a Thread using Thread class. 
 */
class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread from lex.ThreadClass is: " + Thread.currentThread().getName());
    }
}

/**
 * Creating a Thread using Runnable interface. 
 */
class RunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread from lex.RunnableClass is: " + Thread.currentThread().getName());
    }
}

/**
 * Examples of thread safe collection frameworks in java.
 */
class ThreadSafeCollections {
    /**
     * ConcurrentHashMap :- It's Threadsafe and without having to synchronize the whole map.
     * Vary fast read while write is done with a lock, no locking at object level and uses 
     * multitude of locks
     * 
     * SynchronizedHashMap :- It has object level synchronization both read and write acquires a lock.
     * Locking the collection has a performance drawback, it may cause contention.
     * 
     * Ex. :- Vector, HashTable, CopyOnWriteArrayList, CopyOnWriteArraySet, Stack
     */
     
     
}