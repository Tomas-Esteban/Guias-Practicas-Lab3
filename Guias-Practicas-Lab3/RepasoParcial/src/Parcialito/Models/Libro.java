package Parcialito.Models;

import Parcialito.Enum.Genero;
import Parcialito.Interfaz.Alquiler;

import java.util.Date;
import java.util.UUID;

public class Libro extends Ejemplar implements Alquiler {
    private Genero genero;
    private boolean alquilado;
    public Libro(Genero genero, String titulo, int ano,boolean alquilado) {
        super(titulo, ano);
        this.genero = genero;
        this.alquilado = alquilado;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }




    @Override
    public void alquilar(Object o) {
        if(((Libro) o).isAlquilado()){
            System.out.println("El libro " + ((Libro) o).getTitulo() + "se encuentra alquilado" );
        }else{
            ((Libro) o).alquilado = true;
        }
    }

    @Override
    public void devolver(Object o) {
        if(((Libro) o).isAlquilado()){
            ((Libro) o).alquilado = false;
        }else{
            System.out.println("El libro " + ((Libro) o).getTitulo() + "no se pudo devolver." );
        }
    }

    @Override
    public void alquilado(Object o) {

        if(((Libro) o).isAlquilado()){
            System.out.println("El libro " + ((Libro) o).getTitulo() + "se encuentra alquilado." );
        }else{
            System.out.println("El libro " + ((Libro) o).getTitulo() + "se encuentra disponible para alquilar." );
        }

    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Libro: " + "\n" +
                "Genero: "        + genero + "\n" +
                "Alquilado: " + alquilado  + "\n" ;
    }
}
