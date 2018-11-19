package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @Test
    void calculatePayment() {
        {
            CreditService service = new CreditService();
            double payment=service.calculatePayment(70000, 12,18);
            assertEquals(6418, payment);
        }
    }
}