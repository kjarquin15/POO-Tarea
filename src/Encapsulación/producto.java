package Encapsulación;

public class producto {
	 private int    codigo;
	    private String nombre;
	    private double precio;

	    public producto(int codigo, String nombre, double precio) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public void aplicarDescuento(double porcentaje) {
	        double descuento = precio * (porcentaje / 100);
	        precio -= descuento;
	    }

	    public void mostrar() {
	        System.out.printf("  [%d] %-20s  $%.2f%n", codigo, nombre, precio);
	    }

	    public int    getCodigo() { return codigo; }
	    public String getNombre() { return nombre; }
	    public double getPrecio() { return precio; }
	}


