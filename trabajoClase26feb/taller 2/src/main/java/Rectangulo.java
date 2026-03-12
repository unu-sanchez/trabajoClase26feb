public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo() {
        super();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        // Fórmula: Área = base * altura
        this.area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        // Fórmula: Perímetro = 2 * (base + altura)
        this.perimetro = 2 * (base + altura);
    }
}