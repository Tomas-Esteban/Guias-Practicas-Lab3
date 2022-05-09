package Guia2.Ej2;

import java.util.UUID;

public class ItemVenta {
    private UUID uuid;
    private String nombre;
    private String descr;
    private double precUnidad;
    private int cant;

    public ItemVenta( String nombre, String descr, double precUnidad, int cant) {
        this.uuid =UUID.randomUUID();
        this.nombre = nombre;
        this.descr = descr;
        this.precUnidad = precUnidad;
        this.cant = cant;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescr() {
        return descr;
    }

    public double getPrecUnidad() {
        return precUnidad;
    }

    public int getCant() {
        return cant;
    }
    public double getTotal() {
        return precUnidad * cant;
    }


    @Override
    public String toString() {
        return "ItemVenta:--------------------------------------"       + "\n" +
                "ID: "                                     + uuid       + "\n" +
                "Nombre: "                                 + nombre     + "\n" +
                "Descripcion: "                            + descr      + "\n" +
                "Precio por unidad: "                      + precUnidad + "\n" +
                "Cantidad: "                               + cant       + "\n" +
                "------------------------------------------------"      + "\n" ;
    }
}
