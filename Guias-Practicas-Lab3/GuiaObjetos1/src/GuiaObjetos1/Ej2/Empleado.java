package GuiaObjetos1.Ej2;

public class Empleado {
    public int dni = 0;
    public String nombre = "";
    public String apellido = "";
    public double salario = 00;


    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioAnual(){
        double salAnual = salario * 12;
        return salAnual;
    }
    public double aumentarSalario(double porcentaje){
        salario = (porcentaje * salario) / 100;
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado[" +
                "dni= " + dni + ", nombre= " + nombre + ", apellido= " + apellido + ", salario=" + salario +
                ']';
    }
}
