package me.thribs.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeesTest {
    
    @Test
    void Calculations() {
        Employee john = new HiredEmployee("John", "Doe", 12345, 1000, 100, 10);
        Employee jane = new TempEmployee("Jane", "Doe", 12346, 100, 10);

        assertEquals(1090, john.getPayment());
        assertEquals(1000, jane.getPayment());
    }

    @Test
    void Receipts() {
        Employee john = new HiredEmployee("John", "Doe", 12345, 1000, 100, 10);
        Employee jane = new TempEmployee("Jane", "Doe", 12346, 100, 10);

        assertEquals("Receipt for 1100.0 from John Doe account number 12345", john.getReceipt(1100));
        assertEquals("Receipt for 100.0 from Jane Doe account number 12346", jane.getReceipt(100));
    }

    @Test
    void Deposits() {
        Employee john = new HiredEmployee("John", "Doe", 12345, 1000, 100, 10);
        Employee jane = new TempEmployee("Jane", "Doe", 12346, 100, 10);

        john.deposit(100);
        jane.deposit(200);
    }

}
