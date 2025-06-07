package org.example;

public class Multithreading implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
