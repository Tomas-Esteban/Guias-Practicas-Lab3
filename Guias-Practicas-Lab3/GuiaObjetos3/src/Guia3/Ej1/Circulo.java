package Guia3.Ej1;

public class Circulo {
    private double radio = 1.0;
    private String color = "Rojo";

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(radio,2); // libreria propia de Java Math
    }

    @Override
    public String toString() {
        return "Circulo:----------------" + "\n" +
                "Radio: "         + radio + "\n" +
                "Color: "         + color + "\n" ;
    }
}
