package testprofesor;
class Profesor{
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    private Provincia provincia;      
    public Profesor() {
    }
    public Profesor(String nombre, String apellido, String cedula, double sueldoBasico,  Provincia provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        this.provincia = provincia;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldoB() {
        return sueldoBasico;
    }

    public void setSueldoB(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = (getSueldoB() * 1.2) ;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Datos de Profesor"+
                " \nnombre: " + nombre + 
                " \napellido: " + apellido +
                " \ncedula: " + cedula +
                " \nSueldo Basico: " + sueldoBasico +
                " \nSueldo Total: " + sueldoTotal +
                " \nProvincia: " + provincia 
                ;
    }
}


class Provincia {
    public Provincia(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    private String nombre;
    private int habitantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return  
                "\nnombre: " + nombre + 
                "\nhabitantes: " + habitantes ;
    }
}
public class TestProfesor {

    public static void main(String[] args) {
        Provincia provincia1 = new Provincia("CATACOCHA",1000);
        Profesor profesor1 = new Profesor("Juan","Gonzales","11037262181",100,provincia1 );
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
    }
    
}
