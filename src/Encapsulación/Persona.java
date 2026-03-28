package Encapsulación;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("  Nombre  : " + nombre + " " + apellido);
        System.out.println("  Edad    : " + edad + " años");
    }

    // Getters
    public String getNombre()   { return nombre; }
    public String getApellido() { return apellido; }
    public int    getEdad()     { return edad; }
}

