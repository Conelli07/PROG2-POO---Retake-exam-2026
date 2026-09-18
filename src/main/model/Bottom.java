package model;

public class Bottom extends Garment {
    private int waistSize;

    public Bottom(String name, Size size, double unitPrice, Material material, int waistSize) {
        super(name, size, unitPrice, material);
        this.waistSize = waistSize;
    }

    public int getWaistSize() { return waistSize; }
    public void setWaistSize(int waistSize) { this.waistSize = waistSize; }
}
