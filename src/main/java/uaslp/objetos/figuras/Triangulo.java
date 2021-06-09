package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    public double base;
    public double altura;
    public double area;
    private String description;
    private String name;

    public Triangulo(){
        this.description="Cualquier triangulo";
        this.name="Triangulo";
    }

    public Triangulo(double base, double altura){
        this.altura=altura;
        this.base=base;
        this.description="Cualquier triangulo";
        this.name="Triangulo";
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

    public String getDescription() {
        return  description;
    }

    @Override
    public String getName() {
        return name;
    }
}
