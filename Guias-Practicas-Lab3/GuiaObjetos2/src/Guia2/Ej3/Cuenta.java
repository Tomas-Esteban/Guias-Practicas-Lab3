package Guia2.Ej3;

import java.util.UUID;

public class Cuenta {
    private static final int MAX_OPS = 10; // cantidad tope de operaciones
    private UUID uuid;
    private double balance;
    private Titular titular;
    private int contadorOperaciones = 0;
    private String operaciones[] = new String[MAX_OPS];

    public Cuenta( double balance, Titular titular) {
        this.uuid = UUID.randomUUID();
        this.balance = balance;
        this.titular = titular;
    }

    public UUID getUuid() {
        return uuid;
    }

    public double getBalance() {
        return balance;
    }

    public Titular getTitular() {
        return titular;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public double depositar(double monto){
        imprimitTicket(monto,"dep");
        return this.balance += monto;
    }
    public double extraer(double monto){
        double tempBalance = this.balance - monto;
        if(tempBalance >= -2000){
            this.balance -= monto;
            imprimitTicket(monto,"ext");
        }
        else{
            System.out.println("Monto insuficiente!! ");
        }
        return this.balance;
    }

    private void imprimitTicket(double monto, String operacion){
        if(this.contadorOperaciones == MAX_OPS){
            this.contadorOperaciones = 0;
        }
        if (operacion == "dep"){
            operaciones[contadorOperaciones] = "El cliente " + titular.getNombre() + ", depositó " + monto;
            this.contadorOperaciones++;
        }
        if (operacion == "ext"){
            operaciones[contadorOperaciones] = "El cliente " + titular.getNombre() + ", retiro " + monto;
            this.contadorOperaciones++;
        }
    }

    @Override
    public String toString() {
        return "Cuenta:-----------------------------" + "\n" +
                "ID:  "                        + uuid + "\n" +
                "Balance: "                 + balance + "\n" +
                "Titular: "                 + titular + "\n" +
                "-----------------------------------" + "\n" ;
    }
}
