package com.example.java;

import java.util.LinkedList;

public class colaConListaVinculada {

    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        queue.add(new Customer("David"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue){

        Customer c = queue.poll();
        c.serve();
    }

}

class Customer{
    private boolean hasBeenServed;
    private String name;



    public Customer(String name){
        hasBeenServed = false;
        this.name = name;
    }

    public void serve(){
        hasBeenServed = true;
        System.out.println(name + " has been served");
    }

    public String toString(){
        return name;
    }
}
