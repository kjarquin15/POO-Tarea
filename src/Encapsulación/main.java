package Encapsulación;

public class main {
	

	    // ─────────────────────────────────────────────────────────
	    //  Utilidades de presentación
	    // ─────────────────────────────────────────────────────────
	    static void titulo(int num, String texto) {
	        System.out.println();
	        System.out.println("╔══════════════════════════════════════════════════╗");
	        System.out.printf ("║  Ejercicio %d: %-35s║%n", num, texto);
	        System.out.println("╚══════════════════════════════════════════════════╝");
	    }

	    static void separador() {
	        System.out.println("  --------------------------------------------------");
	    }

	    // ─────────────────────────────────────────────────────────
	    //  MAIN
	    // ─────────────────────────────────────────────────────────
	    public static void main(String[] args) {
	        System.out.println("╔══════════════════════════════════════════════════╗");
	        System.out.println("║        POO-Tarea  ·  Encapsulación               ║");
	        System.out.println("╚══════════════════════════════════════════════════╝");

	        // ── 1. Clase Persona ──────────────────────────────────
	        titulo(1, "Clase Persona");
	        Persona p1 = new Persona("Ana",    "García",   25);
	        Persona p2 = new Persona("Carlos", "Martínez", 32);
	        Persona p3 = new Persona("Lucía",  "López",    19);

	        System.out.println("\n  Persona 1:");  p1.mostrar();
	        System.out.println("\n  Persona 2:");  p2.mostrar();
	        System.out.println("\n  Persona 3:");  p3.mostrar();

	        // ── 2. Clase Rectángulo ───────────────────────────────
	        titulo(2, "Clase Rectángulo");
	        rectangulo r1 = new rectangulo(5.0, 3.0);
	        rectangulo r2 = new rectangulo(8.0, 2.5);

	        r1.mostrar("Rectángulo 1");
	        r2.mostrar("Rectángulo 2");
	        separador();
	        if (r1.area() > r2.area()) {
	            System.out.printf("  El Rectángulo 1 tiene mayor área (%.1f > %.1f)%n",
	                    r1.area(), r2.area());
	        } else if (r2.area() > r1.area()) {
	            System.out.printf("  El Rectángulo 2 tiene mayor área (%.1f > %.1f)%n",
	                    r2.area(), r1.area());
	        } else {
	            System.out.println("  Ambos rectángulos tienen la misma área.");
	        }

	        // ── 3. Clase Producto ─────────────────────────────────
	        titulo(3, "Clase Producto");
	        producto prod1 = new producto(101, "Laptop Dell XPS",   1500.00);
	        producto prod2 = new producto(102, "Teclado Mecánico",   120.00);

	        System.out.println("\n  Precios originales:");
	        prod1.mostrar();
	        prod2.mostrar();

	        prod1.aplicarDescuento(10);   // 10 % de descuento
	        prod2.aplicarDescuento(25);   // 25 % de descuento

	        System.out.println("\n  Precios con descuento aplicado:");
	        System.out.println("  (Laptop: -10 %  |  Teclado: -25 %)");
	        prod1.mostrar();
	        prod2.mostrar();

	        // ── 4. Clase Cuenta ───────────────────────────────────
	        titulo(4, "Clase Cuenta");
	        cuentaatributos cuenta = new   cuentaatributos("María Pérez", 500.00);

	        System.out.println("\n  Operaciones:");
	        cuenta.depositar(200.00);
	        cuenta.retirar(100.00);
	        cuenta.retirar(700.00);   // debe fallar: saldo insuficiente
	        cuenta.depositar(-50.00); // debe fallar: monto inválido
	        cuenta.retirar(250.00);
	        separador();
	        cuenta.mostrarSaldo();

	        // ── 5. Clase Libro ────────────────────────────────────
	        titulo(5, "Clase Libro");
	        libroatributos libro1 = new libroatributos("El Quijote",           "Miguel de Cervantes", 863);
	        libroatributos libro2 = new libroatributos("El Principito",        "Antoine de Saint-Exupéry", 96);
	        libroatributos libro3 = new libroatributos("1984",                 "George Orwell",       328);

	        System.out.println();
	        System.out.printf("  %-35s   %-22s   %s   %s%n",
	                "Título", "Autor", "Págs", "¿Es largo?");
	        separador();
	        libro1.mostrar();
	        libro2.mostrar();
	        libro3.mostrar();

	        // ── 6. Clase Calculadora ──────────────────────────────
	        titulo(6, "Clase Calculadora");
	        calculadora calc = new calculadora();
	        double a = 15, b = 4, c = 0;

	        System.out.printf("%n  Operandos: A = %.0f  |  B = %.0f%n", a, b);
	        separador();
	        System.out.printf("  Suma          : %.0f + %.0f = %.2f%n",  a, b, calc.sumar(a, b));
	        System.out.printf("  Resta         : %.0f - %.0f = %.2f%n",  a, b, calc.restar(a, b));
	        System.out.printf("  Multiplicación: %.0f × %.0f = %.2f%n",  a, b, calc.multiplicar(a, b));
	        System.out.printf("  División      : %.0f ÷ %.0f = %s%n",    a, b, calc.dividir(a, b));
	        System.out.printf("  División      : %.0f ÷ %.0f = %s%n",    a, c, calc.dividir(a, c));

	        // ── 7. Clase Fecha ────────────────────────────────────
	        titulo(7, "Clase Fecha");
	        fecha fecha1 = new fecha(15,  6, 2024);   // válida
	        fecha fecha2 = new fecha(32,  3, 2023);   // inválida (día > 31)
	        fecha fecha3 = new fecha( 1, 13, 2022);   // inválida (mes > 12)

	        System.out.println();
	        fecha1.mostrar();
	        fecha2.mostrar();
	        fecha3.mostrar();

	        // ── Fin ───────────────────────────────────────────────
	        System.out.println();
	        System.out.println("╔══════════════════════════════════════════════════╗");
	        System.out.println("║          Fin de la ejecución  ✓                  ║");
	        System.out.println("╚══════════════════════════════════════════════════╝");
	        System.out.println();
	    }
	}


