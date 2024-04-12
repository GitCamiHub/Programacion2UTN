package Composicion;

public class Puerta {
    private String material;

    public Puerta(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }


    @Override
    public String toString() {
        return "Material: " + material;
    }
}
