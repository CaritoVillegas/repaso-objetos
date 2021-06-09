package uaslp.objetos.figuras;

public class Cuadrado implements Figura{
    private double lado;
    private double area;
    private static final String name="Cuadrado";

    public Cuadrado(double lado){
        this.lado=lado;
    }

    public Cuadrado(){}

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return(lado*lado);
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String getName() {
        return name;
    }
}
