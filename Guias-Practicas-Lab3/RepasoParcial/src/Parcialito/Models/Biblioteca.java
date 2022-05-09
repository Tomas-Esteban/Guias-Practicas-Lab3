package Parcialito.Models;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libroList;
    private ArrayList<Diario> diarioList;
    private ArrayList<Revista> revistaList;

    public Biblioteca(ArrayList<Libro> libroList, ArrayList<Diario> diarioList, ArrayList<Revista> revistaList) {
        this.libroList = libroList;
        this.diarioList = diarioList;
        this.revistaList = revistaList;
    }

    public ArrayList<Libro> getLibroList() {
        return libroList;
    }

    public void setLibroList(ArrayList<Libro> libroList) {
        this.libroList = libroList;
    }

    public ArrayList<Diario> getDiarioList() {
        return diarioList;
    }

    public void setDiarioList(ArrayList<Diario> diarioList) {
        this.diarioList = diarioList;
    }

    public ArrayList<Revista> getRevistaList() {
        return revistaList;
    }

    public void setRevistaList(ArrayList<Revista> revistaList) {
        this.revistaList = revistaList;
    }

    public void mostrarLibros(ArrayList<Libro> libroList){
        int i = 1;
        for (Libro l : libroList){
            System.out.println("N: " + i + "-----------------------------------\n");
            l.toString();
            i++;
        }
    }
    public void mostrarDiarios(ArrayList<Diario> diarioList){
        int i = 1;
        for (Diario d : diarioList){
            System.out.println("N: " + i + "-----------------------------------\n");
            d.toString();
            i++;
        }
    }
    public void mostrarRevistas(ArrayList<Revista> revistaList){
        int i = 1;
        for (Revista r : revistaList){
            System.out.println("N: " + i + "-----------------------------------\n");
            System.out.println(r.toString());
            i++;
        }
    }
}

