package Parcialito.Models;

import Parcialito.Enum.Genero;

import java.util.Date;
import java.util.UUID;

public class Diario extends Ejemplar{

    private boolean leyendo;

    public Diario(String titulo, int ano, boolean leyendo) {
        super(titulo, ano);
        this.leyendo = leyendo;
    }

    public boolean isLeyendo() {
        return leyendo;
    }

    public void setLeyendo(boolean leyendo) {
        this.leyendo = leyendo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Diario: " + "\n" +
                "Esta siendo leido:" + leyendo + "\n";
    }
}