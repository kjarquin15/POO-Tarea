package Encapsulación;

public class libroatributos {
	 private String titulo;
	    private String autor;
	    private int    paginas;

	    public libroatributos(String titulo, String autor, int paginas) {
	        this.titulo  = titulo;
	        this.autor   = autor;
	        this.paginas = paginas;
	    }

	    public boolean esLargo() { return paginas > 300; }

	    public void mostrar() {
	        System.out.printf("  %-35s | %-22s | %4d págs | %s%n",
	                titulo, autor, paginas,
	                esLargo() ? "Es largo " : "No es largo");
	    }

	    public String getTitulo()  { return titulo; }
	    public String getAutor()   { return autor; }
	    public int    getPaginas() { return paginas; }

}
