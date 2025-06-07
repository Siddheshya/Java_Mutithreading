package org.example;

public class ConsumerImpl implements Consumer , Runnable {

    private WareHouseImpl wareHouse;

    public ConsumerImpl(WareHouseImpl wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        System.out.println("Consumer is going to consume the object...");
        wareHouse.consume();
    }

}
