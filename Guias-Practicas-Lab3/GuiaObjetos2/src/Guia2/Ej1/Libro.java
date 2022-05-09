package Guia2.Ej1;

import java.util.Arrays;

public class Libro {
    private String titulo;
    private double precio;
    private int cantidad;
    private Autor[] a;

    public Libro(String titulo, double precio, int cantidad, Autor[] a) {
        this.titulo = titulo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.a = a;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Autor[] getA() {
        return a;
    }

    public void setA(Autor[] a) {
        this.a = a;
    }
    public String imprimirMsj(){
        StringBuilder nombres = new StringBuilder();
        for(Autor autor: a){
            nombres.append(autor.getNombre());
            nombres.append(" ");
            nombres.append(autor.getApellido());
            nombres.append(" ");
        }
        return "El Libro, " + this.titulo + " de " + nombres + "tiene de precio " + this.precio + " pesos.";
    }

    @Override
    public String toString() {
        return "Libro:-------------------------"    + "\n" +
                "Titulo:   "            + titulo    + "\n" +
                "Precio:   "            + precio    + "\n" +
                "Cantidad: "            + cantidad  + "\n" +
                "Autor:    " + Arrays.toString(a)   + "\n" +
                "------------------------------"    + "\n" ;
    }
}
