package org.example;

public class ProducerImpl implements Runnable, Producer {

    private WareHouse wareHouse;

    public ProducerImpl(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        System.out.println("Producer is producing the object....");
        try {
            Thread.sleep(10000);
            wareHouse.add(new Product("WashingPowder"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
