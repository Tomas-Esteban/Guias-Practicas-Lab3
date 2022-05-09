package Guia3.Ej3;

public abstract class Figura {
    protected String color = "Azul";

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura:---------------" + "\n" +
                "Color: " + color + "\n" ;
    }
}
