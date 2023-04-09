package com.company;

import java.time.LocalDate;
import java.util.*;

public class Main {

    private static List<String[]> customerData = Arrays.asList(
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "-7500", "01-10-2022"},
            new String[]{"1", "Wayne Enterprises", "18000", "12-22-2021"},
            new String[]{"3", "Ace Chemical", "-48000", "01-10-2022"},
            new String[]{"3", "Ace Chemical", "-95000", "12-15-2021"},
            new String[]{"1", "Wayne Enterprises", "175000", "01-01-2022"},
            new String[]{"1", "Wayne Enterprises", "-35000", "12-09-2021"},
            new String[]{"1", "Wayne Enterprises", "-64000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "70000", "12-29-2022"},
            new String[]{"2", "Daily Planet", "56000", "12-13-2022"},
            new String[]{"2", "Daily Planet", "-33000", "01-07-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "33000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "140000", "01-25-2022"},
            new String[]{"2", "Daily Planet", "5000", "12-12-2022"},
            new String[]{"3", "Ace Chemical", "-82000", "01-03-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"}
    );

    public static void main(String[] args) {
        //Update this

        //using a hash since it's easily accessible and can store it and call by it if needed
        //geeks4geeks helped me with this and understand it
       Map<Integer, Customer> customers = new HashMap<>();
       for (String[] data: customerData){
           int id = Integer.parseInt(data[0]);
           String name = data[1];
           int charge = Integer.parseInt(data[2]);
           String date = data[3];

           Customer customer = customers.getOrDefault(id, new Customer());
           customer.setId(id);
           customer.setName(name);
           customer.getCharges().add(new AccountRecord());
           customers.put(id, customer);

       }


        List<Customer> uniqueCustomers = new ArrayList<>();

        for (String[] data : customerData) {
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            int charge = Integer.parseInt(data[2]);
            String date = data[3];

            Customer customer = customers.getOrDefault(id, new Customer());
            customer.setId(id);
            customer.setName(name);
            customer.getCharges().add(new AccountRecord());
            customers.put(id, customer);

            if (!uniqueCustomers.contains(customer)) {
                uniqueCustomers.add(customer);
            }

        }
       List<Customer> positiveAccounts = new ArrayList<>();
       List<Customer> negativeAccounts = new ArrayList<>();

       for (Customer customer : customers.values()) {
           if (customer.getBalance() >= 0) {
               positiveAccounts.add(customer);
           } else {
               negativeAccounts.add(customer);
           }
       }

       System.out.println("Positive accounts:");
       for (Customer customer : positiveAccounts) {
          //  if (customer.getBalance() > 0) {
                System.out.println(customer);
            }

       System.out.println("Negative accounts:");
        for (Customer customer : negativeAccounts) {
          //  if (customer.getBalance() < 0) {
          System.out.println(customer);
            }

        System.out.println("Unique customers:");
        for (Customer customer : uniqueCustomers) {
            System.out.println(customer);
        }
        }
}
//my attempt 500th LOL !
       // for (String[] customerInfo : customerData){
       //     int id = Integer.parseInt(customerInfo[0]);
        //    String name = customerInfo[1];
         //   int charge = Integer.parseInt(customerInfo[2]);
        //    String date = customerInfo[3];
       // }
       // System.out.println("Positive accounts:");
       // System.out.println("Negative accounts:");




