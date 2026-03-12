import java.util.Scanner;

public class PruebaSobreEscritura {

    // Declaramos el Scanner como estático para usarlo en todos los métodos de esta clase
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE FIGURAS GEOMÉTRICAS ---");
            System.out.println("1. Calcular Circunferencia");
            System.out.println("2. Calcular Cuadrado");
            System.out.println("3. Calcular Rectángulo");
            System.out.println("4. Calcular Triángulo");
            System.out.println("5. Salir");
            System.out.print("\nSeleccione una opción: ");

            // Validación para evitar errores si el usuario teclea letras
            while (!scanner.hasNextInt()) {
                System.out.println("\nError: ingrese un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    obtenerCalculosCircunferencia();
                    break;
                case 2:
                    obtenerCalculosCuadrado();
                    break;
                case 3:
                    obtenerCalculosRectangulo();
                    break;
                case 4:
                    obtenerCalculosTriangulo();
                    break;
                case 5:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close(); // Cerramos el escáner al terminar el programa
    }

    public static void obtenerCalculosCircunferencia() {
        Circunferencia c = new Circunferencia();
        System.out.print("\nIngrese el radio de la circunferencia: ");
        c.setRadio(leerDoublePositivo());

        c.calcularArea();
        c.calcularPerimetro();

        System.out.println("\n=== RESULTADOS CIRCUNFERENCIA ===");
        System.out.println("Área: " + c.obtenerArea());
        System.out.println("Perímetro: " + c.obtenerPerimetro());
    }

    public static void obtenerCalculosCuadrado() {
        Cuadrado c = new Cuadrado();
        System.out.print("\nIngrese el lado del cuadrado: ");
        c.setLado(leerDoublePositivo());

        c.calcularArea();
        c.calcularPerimetro();

        System.out.println("\n=== RESULTADOS CUADRADO ===");
        System.out.println("Área: " + c.obtenerArea());
        System.out.println("Perímetro: " + c.obtenerPerimetro());
    }

    public static void obtenerCalculosRectangulo() {
        Rectangulo r = new Rectangulo();
        System.out.print("\nIngrese la base del rectángulo: ");
        r.setBase(leerDoublePositivo());
        System.out.print("Ingrese la altura del rectángulo: ");
        r.setAltura(leerDoublePositivo());

        r.calcularArea();
        r.calcularPerimetro();

        System.out.println("\n=== RESULTADOS RECTÁNGULO ===");
        System.out.println("Área: " + r.obtenerArea());
        System.out.println("Perímetro: " + r.obtenerPerimetro());
    }

    public static void obtenerCalculosTriangulo() {
        Triangulo t = new Triangulo();
        System.out.print("\nIngrese la base del triángulo: ");
        t.setBase(leerDoublePositivo());
        System.out.print("Ingrese la altura del triángulo: ");
        t.setAltura(leerDoublePositivo());

        t.calcularArea();
        t.calcularPerimetro();

        System.out.println("\n=== RESULTADOS TRIÁNGULO ===");
        System.out.println("Área: " + t.obtenerArea());
        System.out.println("Perímetro: " + t.obtenerPerimetro());
    }

    // Método para asegurar que el usuario ingrese números válidos y mayores a 0
    public static double leerDoublePositivo() {
        double valor = 0;
        boolean valido = false;

        do {
            while (!scanner.hasNextDouble()) {
                System.out.print("\nError: ingrese solo números. Intente de nuevo: ");
                scanner.next(); // Limpiar el buffer
            }
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.print("El valor debe ser mayor a 0. Intente de nuevo: ");
            } else {
                valido = true;
            }
        } while (!valido);

        return valor;
    }
}