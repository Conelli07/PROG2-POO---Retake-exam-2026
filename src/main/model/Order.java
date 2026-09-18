package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private String description;
    private Customer customer;
    private List<OrderLine> orderLines;

    public Order(LocalDate orderDate, String description, Customer customer) {
        this.orderDate = orderDate;
        this.description = description;
        this.customer = customer;
        this.orderLines = new ArrayList<>();
    }

    public void addGarment(Garment garment, int quantity) {
        this.orderLines.add(new OrderLine(garment, quantity));
    }

    public double getTotalAmount() {
        double total = 0.0;
        for (OrderLine line : orderLines) {
            total += line.getTotalPrice();
        }
        return total;
    }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<OrderLine> getOrderLines() { return orderLines; }
}