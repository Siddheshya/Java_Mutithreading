package org.example;

public class Main {
    public static void main(String[] args) {

//        Multithreading mt = new Multithreading();
//        Thread t = new Thread(mt);
//        t.start();
//        MultiThreadingLearning mlt = new MultiThreadingLearning();
//        mlt.start();

        WareHouseImpl wareHouse = new WareHouseImpl();

        ProducerImpl producer = new ProducerImpl(wareHouse);
        ConsumerImpl consumer = new ConsumerImpl(wareHouse);

        Thread t1 = new Thread(producer);

        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

    }
}