package Guia3.Ej3;

public class Rectangulo extends Figura {
    protected double base;
    protected double altura;

    public Rectangulo(){
        this.base = 1.0;
        this.altura = 1.0;
    }
    public Rectangulo( double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    @Override
    public double calcularArea(){
        return (this.base  * this.altura);
    }
    @Override
    public double calcularPerimetro(){
        return (2 * (this.base + this.altura));
    }

    @Override
    public String toString() {
        return "Rectangulo:------------------------" +
                "Color: " + color + "\n" +
                "Base: " + base + "\n" +
                "Altura: " + altura + "\n";
    }
}
