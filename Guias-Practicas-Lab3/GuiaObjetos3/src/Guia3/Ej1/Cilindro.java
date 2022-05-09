package Guia3.Ej1;

public class Cilindro extends Circulo{
    private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, String color) {
        super(radio, color);
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((2 * Math.PI * super.getRadio() * this.altura) + (2 * super.calcularArea()));
    }

    public double calcularVolumen(){
        return super.calcularArea() * this.altura;
    }

    @Override
    public String toString() {
        return "Cilindro:----------------------- " + "\n" +
                "Subclase de: " + super.toString() + "\n" +
                "Altura: "      + altura           + "\n" ;
    }
}
