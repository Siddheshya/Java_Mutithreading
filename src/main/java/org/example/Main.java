package org.example;

public class Main {
    public static void main(String[] args) {

        Multithreading mt = new Multithreading();
        Thread t = new Thread(mt);
        t.start();
        MultiThreadingLearning mlt = new MultiThreadingLearning();
        mlt.start();
    }
}