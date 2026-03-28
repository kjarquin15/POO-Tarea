package Encapsulación;

public class cuentaatributos {
	private String titular;
    private double saldo;

    public cuentaatributos(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo   = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("   El monto a depositar debe ser mayor a 0.");
            return;
        }
        saldo += monto;
        System.out.printf("   Depósito de $%.2f realizado. Saldo: $%.2f%n", monto, saldo);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("   El monto a retirar debe ser mayor a 0.");
            return;
        }
        if (monto > saldo) {
            System.out.printf("   Saldo insuficiente. Saldo actual: $%.2f%n", saldo);
            return;
        }
        saldo -= monto;
        System.out.printf("   Retiro de $%.2f realizado.  Saldo: $%.2f%n", monto, saldo);
    }

    public void mostrarSaldo() {
        System.out.printf("  Titular: %-20s Saldo final: $%.2f%n", titular, saldo);
    }

    public String getTitular() { return titular; }
    public double getSaldo()   { return saldo; }

}
