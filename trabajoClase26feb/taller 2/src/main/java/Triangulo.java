public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
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
        // Fórmula: Área = (base * altura) / 2
        this.area = (base * altura) / 2;
    }

    @Override
    public void calcularPerimetro() {
        // Asumiendo un triángulo isósceles para poder calcular los lados usando Pitágoras
        double ladoInclinado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        this.perimetro = base + (2 * ladoInclinado);
    }
}