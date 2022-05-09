package Guia3.Ej2;

public class Estudiante extends Persona{
    private int anioIngreso;
    private double cuota;
    private String carrera;

    public Estudiante(int dni, String nombre, String apellido, String email, String direccion, int anioIngreso, double cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante:-----------------" + "\n" +
                "Anio Ingreso: " + anioIngreso + "\n" +
                "Cuota: " + cuota + "\n" +
                "Carrera:" + carrera + "\n" +
                "Dni: " + dni + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Email: " + email + "\n" +
                "Direccion: " + direccion + "\n";
    }
}
