package Guia3;

import Guia3.Ej1.Cilindro;
import Guia3.Ej2.Estudiante;
import Guia3.Ej2.Persona;
import Guia3.Ej2.Staff;
import Guia3.Ej3.Circulo;
import Guia3.Ej3.Cuadrado;
import Guia3.Ej3.Figura;
import Guia3.Ej3.Rectangulo;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("\n==== Ejercicio 1 ==== \n");
        Cilindro cilindroUno = new Cilindro();
        System.out.println(cilindroUno);
        System.out.println("Radio: " + cilindroUno.getRadio());
        System.out.println("Altura: " + cilindroUno.getAltura());
        System.out.println("Area: " + cilindroUno.calcularArea()); //comentar metodo en clase cilindo para calcular solo area del circulo
        System.out.println("Volumen: " + cilindroUno.calcularVolumen());

        Cilindro cilindroDos = new Cilindro(10.5, 20.3);
        System.out.println(cilindroDos);
        System.out.println("Radio: " + cilindroDos.getRadio());
        System.out.println("Altura: " + cilindroDos.getAltura());
        System.out.println("Area: " + cilindroDos.calcularArea());
        System.out.println("Volumen: " + cilindroDos.calcularVolumen());

        // Ejercicio 2
        System.out.println("\n==== Ejercicio 2 ==== \n");
        Estudiante e1 = new Estudiante(34654124, "Pedro", "Suarez", "pedros@email.com", "Calle falsa 123 1A", 2018, 1580.50, "TSSI");
        Estudiante e2 = new Estudiante(34654123, "Luis", "Suarez", "luiss@email.com", "Calle falsa 231 1A", 2018, 1380.50, "TSP");
        Estudiante e3 = new Estudiante(34654122, "Maria", "Gomez", "mariag@email.com", "Calle falsa 321 1A", 2018, 1780.50, "TSSI");
        Estudiante e4 = new Estudiante(34654121, "Monica", "Perez", "monicap@email.com", "Calle falsa 213 1A", 2018, 1180.50, "TSP");

        Staff s1 = new Staff(34654124, "Humberto", "Perez", "beto@email.com", "Av falsa 123 1A", 21200.75, 'M');
        Staff s2 = new Staff(34653123, "Cristian", "Perez", "cristian@email.com", "Av falsa 231 1A", 22200.75, 'N');
        Staff s3 = new Staff(34652122, "Miriam", "Perez", "miriam@email.com", "Av falsa 321 1A", 21200.75, 'M');
        Staff s4 = new Staff(34651121, "Gabriela", "Perez", "gabriela@email.com", "Av falsa 213 1A", 22200.75, 'N');

        Persona[] institucion = new Persona[10];
        institucion[0] = e1;
        institucion[1] = e2;
        institucion[2] = e3;
        institucion[3] = e4;
        institucion[4] = s1;
        institucion[5] = s2;
        institucion[6] = s3;
        institucion[7] = s4;

        int e = 0;
        int s = 0;

        for (Persona persona : institucion) {
            if (persona != null) {
                if (persona instanceof Estudiante) e++;
                if (persona instanceof Staff) s++;
            }
        }

        System.out.println("En la institucion hay " + e + " estudiantes.");
        System.out.println("En la institucion hay " + s + " miembros de staff.");

        double total = 0.0;

        for (Persona persona : institucion) {
            if (persona != null) {
                if (persona instanceof Estudiante) total += ((Estudiante) persona).getCuota();
            }
        }

        System.out.println("Total cuotas de alumnos " + total + ".-");

        // Ejercicio 3
        System.out.println("\n==== Ejercicio 3 ==== \n");
        Figura circulo = new Circulo("Amarillo", 20.5);
        Figura rectangulo = new Rectangulo("Violeta", 25.3, 17.5);
        Figura cuadrado = new Cuadrado("Verde", 10.0);

        System.out.println(circulo);
        System.out.println(rectangulo);
        System.out.println(cuadrado);

        Figura[] figuras = new Figura[3];
        figuras[0] = circulo;
        figuras[1] = rectangulo;
        figuras[2] = cuadrado;

        for (Figura f : figuras) {
            if (f != null) {
                System.out.println("El area de la figura " + f.getClass().getSimpleName() + " es " + f.calcularArea());
                System.out.println("El perimetro de la figura " + f.getClass().getSimpleName() + " es " + f.calcularPerimetro() + "\n");
            }
        }
    }
}
