public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado() {
        super();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        // Fórmula: Área = lado * lado
        this.area = lado * lado;
    }

    @Override
    public void calcularPerimetro() {
        // Fórmula: Perímetro = 4 * lado
        this.perimetro = 4 * lado;
    }
}