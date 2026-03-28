package Encapsulación;

public class fecha {
	  private int dia;
	    private int mes;
	    private int año;

	    public fecha(int dia, int mes, int año) {
	        this.dia  = dia;
	        this.mes  = mes;
	        this.año = año;
	    }

	    public boolean esValida() {
	        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (año > 0);
	    }

	    public void mostrar() {
	        System.out.printf("  %02d/%02d/%04d  →  %s%n",
	                dia, mes, año,
	                esValida() ? "Fecha válida " : "Fecha inválida ");
	    }

	    public int getDia()  { return dia; }
	    public int getMes()  { return mes; }
	    public int getAño() { return año; }

}
