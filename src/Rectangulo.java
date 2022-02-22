public class Rectangulo implements Figura{

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2)throws ExceptionFigura {
        if(lado1 > lado2*3){
            throw new ExceptionFigura("La base es 3 veces mayor que la altura");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea(){
        return lado1*lado2;
    };
    public double getPerimetro(){

        return (lado1*2) + (lado2*2);
    };
    public Figura clone() throws CloneNotSupportedException{
        Rectangulo aux = null;
        try {
            aux = new Rectangulo(this.getLado1(),this.getLado2());
        } catch (ExceptionFigura e) {
            e.printStackTrace();
        }
        return aux;
    };
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

    public Rectangulo sumaAreas(Rectangulo c2) throws ExceptionFigura {

        double ladoa = this.lado1 + c2.lado1;
        double ladob = this.lado2 + c2.lado2;


        Rectangulo aux = new Rectangulo(ladoa,ladob);

        return aux;
    }


    @Override
    public String toString() {
        return "Rectangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }
}
