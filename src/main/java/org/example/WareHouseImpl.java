package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WareHouseImpl implements WareHouse {

    private Queue<Product> products;

    public WareHouseImpl() {
        products = new LinkedList<>();
    }

    @Override
    public synchronized void add(Product product) {
        System.out.println("Adding product ");
//        try{
//            Thread.sleep(10000);
//        }
//        catch(Exception e){
//
//        }

        this.products.add(product);
        notifyAll();
    }

    @Override
    public synchronized void consume() {
        while(products.isEmpty()) {
            try{
                System.out.println("Waiting for product...");
                wait();
            }
            catch (Exception e){
                //added exception
            }
        }
        System.out.println("Consumer started consuming the object...");
        this.products.poll();
        System.out.println("Consumer finished consuming the object...");
    }

    public Queue<Product> getProducts() {
        return products;
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }


}
