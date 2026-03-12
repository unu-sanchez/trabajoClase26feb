import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoInicial;

        do {

            System.out.print("\nIngrese el saldo inicial de aperturta de su cuenta: ");
            saldoInicial = leerDouble(scanner);

            if (saldoInicial < 0) {
                System.out.println("\nEl saldo no puede ser negativo.");
            }

        } while (saldoInicial < 0);

        CuentaBancaria cuenta = new CuentaBancaria(saldoInicial);

        int opcion;

        do {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Depositar saldo");
            System.out.println("2. Retirar saldo");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");

            System.out.print("\nSeleccione una opcion: ");

            while (!scanner.hasNextInt()) {
                System.out.println("\nError: ingrese un numero valido.");
                scanner.next();
            }

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("\nIngrese cantidad a depositar: ");
                    double deposito = leerDouble(scanner);
                    cuenta.depositar(deposito);
                    break;

                case 2:

                    System.out.print("\nIngrese cantidad a retirar: ");
                    double retiro = leerDouble(scanner);
                    cuenta.retirar(retiro);
                    break;

                case 3:

                    cuenta.mostrarSaldo();
                    break;

                case 4:

                    System.out.println("\nSaliendo del programa...");
                    break;

                default:

                    System.out.println("\nOpcion invalida.");
            }

        } while (opcion != 4);

        scanner.close();
    }


    public static double leerDouble(Scanner scanner) {

        while (!scanner.hasNextDouble()) {

            System.out.println("\nError: ingrese solo numeros.");
            scanner.next();

        }

        return scanner.nextDouble();
    }

}