package GuiaObjetos1;

import GuiaObjetos1.Ej1.Rectangulo;
import GuiaObjetos1.Ej2.Empleado;
import GuiaObjetos1.Ej3.ItemVenta;
import GuiaObjetos1.Ej4.Cuenta;
import GuiaObjetos1.Ej5.Hora;

public class Main {

    public static void main(String[] args) {
        //Ej 1---------------------------------------------------------------------------------
        System.out.println("Ejercicio1:------------------------------------------------------\n");

        Rectangulo r1 = new Rectangulo(2,3);
        System.out.println("La altura es: " + r1.getAlto() + "\n");
        System.out.println("El ancho es: " + r1.getAncho() + "\n");
        System.out.println("El Area es: " + r1.calcularArea() + "\n");
        System.out.println("El Perimetro es: " + r1.calcularPerimetro() + "\n");

        r1.setAlto(3.5);
        r1.setAncho(4.2);
        System.out.println("La altura es: " + r1.getAlto() + "\n");
        System.out.println("El ancho es: " + r1.getAncho() + "\n");
        System.out.println("El Area es: " + r1.calcularArea() + "\n");
        System.out.println("El Perimetro es: " + r1.calcularPerimetro() + "\n");

        Rectangulo r2 = new Rectangulo();
        System.out.println("El Area es: " + r2.calcularArea() + "\n");
        System.out.println("El Perimetro es: " + r2.calcularPerimetro() + "\n");
        //Ej 2---------------------------------------------------------------------------------
        System.out.println("Ejercicio2:------------------------------------------------------\n");

        Empleado e1 = new Empleado(23456345,"Carlos","Gutierrez",25000);
        Empleado e2 = new Empleado(34234123,"Ana","Sanchez",25700);
        System.out.println(e1.toString() + "\n");
        System.out.println(e2.toString() + "\n");
        e1.aumentarSalario(15);
        System.out.println("El salario anual de " + e1.getNombre() + " es, " + e1.calcularSalarioAnual());

        //Ej 3---------------------------------------------------------------------------------
        System.out.println("Ejercicio3:------------------------------------------------------\n");

        ItemVenta i1 = new ItemVenta(1,"Celular",10,200);
        System.out.println(i1.toString());

        //Ej 4---------------------------------------------------------------------------------
        System.out.println("Ejercicio4:------------------------------------------------------\n");

        Cuenta c1 = new Cuenta(1,"cuenta 1",15000);
        System.out.println("Se realizo un credito de 2500 dando como resultado un balance de " + c1.credito(2500));
        System.out.println("Se realizo una compra de 1500 dando como resultado un balance de " + c1.debito(1500));
        System.out.println("Se realizo una compra de 30000 dando como resultado un balance de " + c1.debito(30000));
        System.out.println(c1.toString());

        //Ej 5---------------------------------------------------------------------------------
        System.out.println("Ejercicio5:------------------------------------------------------\n");
        Hora h1 = new Hora(23, 59, 59);
        System.out.println(h1);

        h1.sumarSeg();
        System.out.println(h1);

        h1.restarSeg();
        System.out.println(h1);


    }
}
