package Encapsulación;

public class calculadora {
	public double sumar(double a, double b)      { return a + b; }
    public double restar(double a, double b)     { return a - b; }
    public double multiplicar(double a, double b){ return a * b; }

    public String dividir(double a, double b) {
        if (b == 0) return "Error: División entre cero no permitida";
        return String.valueOf(a / b);
    }

}
