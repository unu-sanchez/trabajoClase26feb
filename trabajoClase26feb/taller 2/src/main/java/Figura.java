public abstract class Figura {
    // Atributos protegidos para que las subclases tengan acceso
    protected double area;
    protected double perimetro;

    // Constructor
    public Figura() {
    }

    // Métodos para obtener los resultados
    public double obtenerArea() {
        return this.area;
    }

    public double obtenerPerimetro() {
        return this.perimetro;
    }

    // Métodos abstractos que las subclases están obligadas a sobreescribir
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
}