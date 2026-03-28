package Encapsulación;

public class rectangulo {

private double base;
private double altura;

public rectangulo(double base, double altura) {
    this.base   = base;
    this.altura = altura;
}

public double area()      { return base * altura; }
public double perimetro() { return 2 * (base + altura); }

public void mostrar(String nombre) {
    System.out.println("  " + nombre + " -> Base: " + base
            + ", Altura: " + altura
            + ", Área: " + area()
            + ", Perímetro: " + perimetro());
}

public double getBase()   { return base; }
public double getAltura() { return altura; }
}
