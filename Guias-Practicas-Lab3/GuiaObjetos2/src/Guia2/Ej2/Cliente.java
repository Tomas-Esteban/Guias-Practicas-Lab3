package Guia2.Ej2;

import java.util.UUID;

public class Cliente {
    private UUID uuid;
    private String nombre;
    private String email;
    private double desc;

    public Cliente(String nombre, String email, double desc) {
        this.uuid = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.desc = desc;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public double getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Cliente:---------------------------------"   + "\n" +
                "ID: "                              + uuid   + "\n" +
                "Nombre: "                          + nombre + "\n" +
                "Email:  "                          + email  + "\n" +
                "Descuento: "                       + desc   + "\n" +
                "----------------------------------------"   + "\n" ;
    }
}
