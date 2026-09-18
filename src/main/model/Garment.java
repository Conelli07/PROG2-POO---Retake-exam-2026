package model;

public abstract class Garment {
    private String name;
    private Size size;
    private double unitPrice;
    private Material material;

    public Garment(String name, Size size, double unitPrice, Material material) {
        this.name = name;
        this.size = size;
        this.unitPrice = unitPrice;
        this.material = material;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Size getSize() { return size; }
    public void setSize(Size size) { this.size = size; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public Material getMaterial() { return material; }
    public void setMaterial(Material material) { this.material = material; }
}
