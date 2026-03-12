public class Circunferencia extends Figura {
    private double radio;

    public Circunferencia() {
        super();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        // Fórmula: Área = π * r²
        this.area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void calcularPerimetro() {
        // Fórmula: Perímetro = 2 * π * r
        this.perimetro = 2 * Math.PI * radio;
    }
}