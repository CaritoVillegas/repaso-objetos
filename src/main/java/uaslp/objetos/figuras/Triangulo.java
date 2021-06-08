package uaslp.objetos.figuras;

public class Triangulo {
    public double base;
    public double altura;
    public double area;

    public Triangulo(){}

    public Triangulo(double base, double altura){
        this.altura=altura;
        this.base=base;
    }


    public void setBase(double base) {
        this.base=base;
    }

    public void setAltura(double altura) {
        this.altura=altura;
    }


    public double getArea() {
        area=(base*altura)/2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
