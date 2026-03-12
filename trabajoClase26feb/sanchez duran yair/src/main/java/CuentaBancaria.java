public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("\nNo se permiten depositos negativos o cero.");
        }
        else {
            this.saldo = this.saldo + cantidad;
            System.out.println("\nDeposito realizado.");
        }

    }

    public void retirar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("\nEl retiro debe ser mayor que 0.");
        }
        else if (cantidad > this.saldo) {
            System.out.println("\nSaldo insuficiente.");
        }
        else {
            this.saldo = this.saldo - cantidad;
            System.out.println("\nRetiro realizado.");
        }

    }

    public void mostrarSaldo() {
        System.out.println("\nSaldo actual: " + this.saldo);
    }

}