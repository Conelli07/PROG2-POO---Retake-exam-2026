package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testGetTotalAmount() {
        Customer customer = new Customer(
                "Gilbert", "Cruise",
                LocalDate.of(1995, 5, 20),
                "123 Street", "Gilbert.Cruise@email.com", "12345678"
        );

        Order order = new Order(LocalDate.now(), "Summer collection order", customer);

        Garment tShirt = new Top("T-Shirt", Size.M, 15.0, Material.COTTON, SleeveType.SHORT);
        Garment jeans = new Bottom("Jeans", Size.L, 40.0, Material.NYLON, 32);

        order.addGarment(tShirt, 2);
        order.addGarment(jeans, 1);

        double expectedTotal = 70.0;
        assertEquals(expectedTotal, order.getTotalAmount(), 0.001);
    }
}