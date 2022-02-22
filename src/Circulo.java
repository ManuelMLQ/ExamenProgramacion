import java.util.Map;

public class Circulo implements Figura{

    private double radio;


    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double getArea(){
        return radio*Math.pow(3.14,2);
    };
    @Override
    public double getPerimetro(){
        return 2*3.14*radio;
    };

    @Override
    public Figura clone() throws CloneNotSupportedException{
        Circulo aux = new Circulo(this.getRadio());
        return aux;
    };

    @Override
    public boolean iguales(Figura e)throws ExceptionFigura{

        if(this.getClass() != e.getClass()){
            throw new ExceptionFigura("Las clases de las figuras son distintas");
        }

        if(this == null || e == null){
            throw new ExceptionFigura("Alguna de las dos figuras es null");
        }

        boolean iguales = false;

        if(e.getArea() == this.getArea()){
            iguales = true;
        }

        return iguales;
    };

    public Circulo sumaAreas(Circulo c2){

        double radioa = this.radio + c2.radio;

        Circulo aux = new Circulo(radioa);

        return aux;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
