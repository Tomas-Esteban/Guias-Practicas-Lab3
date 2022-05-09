package Parcialito.Models;

import Parcialito.Enum.Genero;

import java.util.Date;
import java.util.UUID;

public class Ejemplar {

    private UUID codigo;
    private String titulo= " "; //o titular en caso de los diarios y revistas
    private int ano;

    public Ejemplar( String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Ejemplar:--------"  + "\n" +
                "Codigo: " + codigo + "\n" +
                "Titulo: " + titulo + "\n" +
                "Año:    " + ano + "\n";
    }
}
