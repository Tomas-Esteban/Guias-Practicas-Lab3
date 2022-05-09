package Guia4;

import Guia4.Enum.Audiencia;
import Guia4.Enum.Genero;
import Guia4.Modals.Alquiler;
import Guia4.Modals.Cliente;
import Guia4.Modals.Film;
import Guia4.Modals.VideoStore;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Film fims[] = new Film[50];
        fims[0] = new Film(123, 3, Audiencia.G, "El señor de los anillos", LocalDate.of(2005, 3, 12),Genero.AVENTURA);
        fims[1] = new Film(123, 3, Audiencia.G, "Venom", LocalDate.of(2017, 3, 21), Genero.ACCION);

        Cliente clientes[] = new Cliente[50];

        VideoStore v = new VideoStore(fims, clientes);

        v.agregarCliente("Tomas Esteban", "22236017815", "Avenida siempre viva 123");
        v.agregarCliente("Wenceslao Weasle", "22236017815", "Avenida siempre viva 456");

        imprimirClientes(v);
        imprimirFilms(v);

        System.out.println("=== Imprimo alquiler 1 ===\n");
        System.out.println(v.alquilarTitulo("Venom", "Tomas Esteban"));

        System.out.println("=== Imprimo alquiler 2 ===\n");
        System.out.println(v.alquilarTitulo("El señor de los anillos", "Wenceslao Weasle"));

        imprimirAlquileres(v);

        imprimirFilms(v);

        v.devolverFilm(2);

        imprimirAlquileres(v);

        imprimirFilms(v);

        imprimirMasAlquiladas(v);

    }

    public static void imprimirFilms(VideoStore v) {
        System.out.println("\n=== Films ===");
        for (Film film : v.getFilms()) {
            if (film != null) System.out.println(film);
        }
    }

    public static void imprimirClientes(VideoStore v) {
        System.out.println("\n=== Clientes ===");
        for (Cliente cliente : v.getClientes()) {
            if (cliente != null) System.out.println(cliente);
        }
    }

    public static void imprimirAlquileres(VideoStore v) { // devuelve las films alquiladas
        System.out.println("\n=== Films Alquiladas ===");
        for (Alquiler alquiler : v.getAlquileres()) {
            if (alquiler != null) System.out.println(alquiler);
        }
    }
    public static void imprimirMasAlquiladas(VideoStore v) { // devuelve las films alquiladas
        System.out.println("\n=== Films Mas Alquiladas ===");
        Alquiler[] a = v.getAlquileres();
        for (Alquiler alquiler : v.getAlquileres()) {
            for(int i = 0; a[i].getCantAlquilada() < alquiler.getCantAlquilada() ; i++ ){
                System.out.println(alquiler.toString());
            }
        }
    }
}

