package Parcialito;

import Parcialito.Enum.Genero;
import Parcialito.Models.Biblioteca;
import Parcialito.Models.Diario;

import Parcialito.Models.Libro;
import Parcialito.Models.Revista;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Libro l1 = new Libro(Genero.Novela, "ẂencePuto", 1997, false);
        Libro l2 = new Libro(Genero.Cuentos, "Ẃences", 1997, false);
        Libro l3 = new Libro(Genero.Novela, "Ẃence", 1997, false);

        Revista r1 = new Revista("wences", 1997, false, false);
        Revista r2 = new Revista("WencesL", 1997, false, false);
        Revista r3 = new Revista("WencesLife", 1997, false, false);

        Diario d1 = new Diario("diarioWence", 1008, false);
        Diario d2 = new Diario("diarioWence", 1008, false);
        Diario d3 = new Diario("diarioWence", 1008, false);

        ArrayList<Libro> listLibr = new ArrayList<Libro>();
        ArrayList<Revista> listRev = new ArrayList<Revista>();
        ArrayList<Diario> listDiar = new ArrayList<Diario>();

        listLibr.add(l1);
        listLibr.add(l2);
        listLibr.add(l3);

        listRev.add(r1);
        listRev.add(r2);
        listRev.add(r3);

        listDiar.add(d1);
        listDiar.add(d2);
        listDiar.add(d3);
        Biblioteca b = new Biblioteca(listLibr, listDiar, listRev);

        System.out.println("Bienvenido a la biblioteca!\n");

        menuAlquilar(b);
        menuDevolver(b);


    }

    public static void menuAlquilar(Biblioteca b) {
        int flag = 1;
        while (flag >= 1) {
            System.out.println("Seleccione que quiere alquilar/leer:--------------------------------------------\n");
            System.out.println("1-Libros:--------------------------------------------\n");
            System.out.println("2-Diarios:--------------------------------------------\n");
            System.out.println("3-Revistas:--------------------------------------------\n");
            System.out.println("4-Exit:--------------------------------------------\n");
            Scanner n = new Scanner(System.in);
            flag = n.nextInt();
            if (flag == 1) {
                ArrayList<Libro> listLibr = b.getLibroList();
                System.out.println("Seleccione que Libro quiere alquilar:--------------------------------------------\n");
                b.mostrarLibros(listLibr);
                Scanner l = new Scanner(System.in);
                flag = n.nextInt();
                if (listLibr.get(flag).isAlquilado() == false) {
                    Libro xAlquilar = listLibr.get(flag);
                    listLibr.get(flag).alquilar(xAlquilar);
                } else {
                    System.out.println("El libro se encuentra alquilado!\n");
                }
            } else if (flag == 2) {
                ArrayList<Diario> listDiar = b.getDiarioList();
                System.out.println("Seleccione que Diario quiere alquilar:--------------------------------------------\n");
                b.mostrarDiarios(listDiar);
                Scanner l = new Scanner(System.in);
                flag = n.nextInt();
                if (listDiar.get(flag).isLeyendo() == false) {
                    listDiar.get(flag).setLeyendo(true);
                } else {
                    System.out.println("El Diario se encuentra leyendo!\n");
                }
            } else if (flag == 3) {
                ArrayList<Revista> listRev = b.getRevistaList();
                System.out.println("Seleccione que Revista quiere alquilar:--------------------------------------------\n");
                b.mostrarRevistas(listRev);
                Scanner l = new Scanner(System.in);
                flag = n.nextInt();
                if (listRev.get(flag).isAlquilado() == false && listRev.get(flag).isLeyendo() == false) {
                    Revista xAlquilar = listRev.get(flag);
                    listRev.get(flag).alquilar(xAlquilar);
                } else {
                    System.out.println("La revista se encuentra alquilado o se esta leyendo!\n");
                }
            } else {
                break;
            }
        }
    }

    public static void menuDevolver (Biblioteca b){
        int bandera = 1;
        while (bandera >= 1) {
            System.out.println("Seleccione que quiere devlover:--------------------------------------------\n");
            System.out.println("1-Libros:--------------------------------------------\n");
            System.out.println("2-Diarios:--------------------------------------------\n");
            System.out.println("3-Revistas:--------------------------------------------\n");
            System.out.println("4-Exit:--------------------------------------------\n");
            Scanner n = new Scanner(System.in);
            bandera = n.nextInt();
            if (bandera == 1) {
                ArrayList<Libro> listLibr = b.getLibroList();
                System.out.println("Seleccione que Libro quiere devolver:--------------------------------------------\n");
                b.mostrarLibros(listLibr);
                Scanner l = new Scanner(System.in);
                bandera = n.nextInt();
                if (listLibr.get(bandera).isAlquilado()) {
                    Libro xAlquilar = listLibr.get(bandera);
                    listLibr.get(bandera).devolver(xAlquilar);
                } else {
                    System.out.println("El libro no se encuentra alquilado!\n");
                }
            } else if (bandera == 2) {
                ArrayList<Diario> listDiar = b.getDiarioList();
                System.out.println("Seleccione que Diario quiere devolver:--------------------------------------------\n");
                b.mostrarDiarios(listDiar);
                Scanner l = new Scanner(System.in);
                bandera = n.nextInt();
                if (listDiar.get(bandera).isLeyendo()) {
                    listDiar.get(bandera).setLeyendo(false);
                } else {
                    System.out.println("El Diario no se encuentra leyendo!\n");
                }
            } else if (bandera == 3) {
                ArrayList<Revista> listRev = b.getRevistaList();
                System.out.println("Seleccione que Revista quiere devolver:--------------------------------------------\n");
                b.mostrarRevistas(listRev);
                Scanner l = new Scanner(System.in);
                bandera = n.nextInt();
                if (listRev.get(bandera).isAlquilado() || listRev.get(bandera).isLeyendo()) {
                    Revista xAlquilar = listRev.get(bandera);
                    listRev.get(bandera).devolver(xAlquilar);
                } else {
                    System.out.println("La revista se encuentra devuelta o no se esta leyendo!\n");
                }
            } else {
                break;
            }
        }
    }

}
