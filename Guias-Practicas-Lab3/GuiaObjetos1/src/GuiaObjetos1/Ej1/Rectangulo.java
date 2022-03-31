package GuiaObjetos1.Ej1;

public class Rectangulo {
    public double ancho = 1.0;
    public double alto = 1.0;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea(){
        double area = ancho * alto;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro = (ancho + alto) * 2;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo: " + " Ancho: " + ancho + " Alto: " + alto ;
    }
}
