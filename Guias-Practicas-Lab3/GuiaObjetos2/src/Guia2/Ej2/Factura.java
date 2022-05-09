package Guia2.Ej2;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Factura {
    private UUID uuid;
    private LocalDateTime fecha;
    private Cliente cl;
    private ItemVenta[] items;

    public Factura( Cliente cl, ItemVenta[] items) {
        this.uuid = UUID.randomUUID();
        this.fecha = fecha;
        this.cl = cl;
        this.items = items;
    }

    public UUID getUuid() {
        return uuid;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cliente getCliente(){
        return cl;
    }
    public ItemVenta[] getItems(){
        return items;
    }
    public double getTotal(){
        double total = 0.0;
        for(ItemVenta it : items){
            if (it != null){
                total += it.getTotal();
            }
        }
        total = total - (total * (cl.getDesc()/100) );
        return total;
    }

    @Override
    public String toString() {
        return "Factura:----------------------------------"  + "\n" +
                "ID: "                               + uuid  + "\n" +
                "Fecha: "                            + fecha + "\n" +
                "Cliente: "                          + cl    + "\n" +
                "Items: "           + Arrays.toString(items) + "\n" +
                "Total: "                       + getTotal() + "\n" +
                "-----------------------------------------"  + "\n" ;
    }
}
