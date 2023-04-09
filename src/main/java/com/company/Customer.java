package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        //update this
        int balance = 0;
        for(AccountRecord charge : charges){
            balance += charge.getCharge();
        }
        return balance;
    }
    //we create a var balance and set it to 0

    public List<AccountRecord> getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        //update this
        return "Customer ID:" + id + "Customer name:" + name + "Customer balance:" + getBalance();
    }
}
