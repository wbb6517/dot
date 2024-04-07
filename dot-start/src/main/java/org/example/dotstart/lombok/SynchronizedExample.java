package org.example.dotstart.lombok;


import lombok.Synchronized;

public class SynchronizedExample {
    private final Object readLock = new Object();

    @Synchronized
    public static void hello() {
        System.out.println("world");
    }

    public synchronized int answerToLife() {
        return 42;
    }

    @Synchronized("readLock")
    public void foo() {
        System.out.println("bar");
    }
}
