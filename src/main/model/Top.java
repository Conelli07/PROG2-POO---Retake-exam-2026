package model;

public class Top extends Garment {
    private SleeveType sleeveType;

    public Top(String name, Size size, double unitPrice, Material material, SleeveType sleeveType) {
        super(name, size, unitPrice, material);
        this.sleeveType = sleeveType;
    }

    public SleeveType getSleeveType() { return sleeveType; }
    public void setSleeveType(SleeveType sleeveType) { this.sleeveType = sleeveType; }
}