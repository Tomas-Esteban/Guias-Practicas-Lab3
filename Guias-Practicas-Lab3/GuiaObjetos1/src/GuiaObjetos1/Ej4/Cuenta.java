package GuiaObjetos1.Ej4;

public class Cuenta {
    public int id = 0;
    public String nombre = "";
    public double balance = 00;

    public Cuenta() {
    }

    public Cuenta(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuenta[" +
                "id=" + id + ", nombre='" + nombre + ", balance=" + balance +
                ']';
    }

    public double credito(double x){
        balance = balance + x;
        return balance;
    }
    public double debito(double x){
        if(x > balance){
            System.out.println("No se puede extraer un monto mayor al balance " + balance);
        }else{
            balance = balance - x;
        }
        return balance;
    }
}
