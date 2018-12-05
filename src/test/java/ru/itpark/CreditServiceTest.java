package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @Test
    void calculatePayment() {
        {
            CreditService service = new CreditService();
            int payment = service.calculatePayment(70_000, 12, 18);
            assertEquals(6_417, payment);
        }
    }
}