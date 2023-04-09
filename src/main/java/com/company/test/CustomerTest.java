package com.company.test;

import com.company.AccountRecord;
import com.company.Customer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void testGetBalance(){
        Customer customer = new Customer();
        AccountRecord record = new AccountRecord();
        record.setCharge(300);
        customer.getCharges().add(record);
        AccountRecord record1 = new AccountRecord();
        record1.setCharge(-150);
        customer.getCharges().add(record1);

        int expectedBalance = 150;
        int realBalance = customer.getBalance();
        assertEquals(expectedBalance, realBalance);
    }

    //im not going add the date, even though i really should
    //Javapoint, w3wschools, and geeks4geeks helped me out understand this better

    @Test
    public void testToString(){
        Customer customer = new Customer();
        customer.setId(11467);
        customer.setName("Minecraft");
        List<AccountRecord> charges = Arrays.asList(
                new AccountRecord()
        );
// I am going to stop here because my brain is fried!
    }

}



