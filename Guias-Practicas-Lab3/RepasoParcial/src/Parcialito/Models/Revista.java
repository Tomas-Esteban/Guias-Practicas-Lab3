package Parcialito.Models;

import Parcialito.Enum.Genero;
import Parcialito.Interfaz.Alquiler;

import java.util.Date;
import java.util.UUID;

public class Revista extends Ejemplar implements Alquiler {
    private boolean leyendo;
    private boolean alquilado;

    public Revista(String titulo, int ano, boolean leyendo,boolean alquilado) {
        super(titulo, ano);
        this.leyendo = leyendo;
        this.alquilado = alquilado;
    }

    public boolean isLeyendo() {
        return leyendo;
    }

    public void setLeyendo(boolean leyendo) {
        this.leyendo = leyendo;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }


    @Override
    public void alquilar(Object o) {
        if(((Revista) o).isAlquilado()){
            System.out.println("El Revista " + ((Revista) o).getTitulo() + "se encuentra alquilado" );
        }else{
            ((Revista) o).alquilado = true;
        }
    }

    @Override
    public void devolver(Object o) {
        if(((Revista) o).isAlquilado()){
            ((Revista) o).alquilado = false;
        }else{
            System.out.println("El Revista " + ((Revista) o).getTitulo() + "no se pudo devolver." );
        }
    }

    @Override
    public void alquilado(Object o) {

        if(((Revista) o).isAlquilado()){
            System.out.println("El Revista " + ((Revista) o).getTitulo() + "se encuentra alquilado." );
        }else{
            System.out.println("El Revista " + ((Revista) o).getTitulo() + "se encuentra disponible para alquilar." );
        }

    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                "Revista:" + "\n" +
                "Esta siendo leida: " + leyendo + "\n" +
                "Alquilada: " + alquilado + "\n" ;
    }
}
