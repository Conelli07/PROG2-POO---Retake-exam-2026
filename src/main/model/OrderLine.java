package model;

public class OrderLine {
    private Garment garment;
    private int quantity;

    public OrderLine(Garment garment, int quantity) {
        this.garment = garment;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return garment.getUnitPrice() * quantity;
    }

    public Garment getGarment() { return garment; }
    public void setGarment(Garment garment) { this.garment = garment; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
