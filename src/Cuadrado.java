public class Cuadrado implements Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        return lado*lado;
    };
    public double getPerimetro(){

        return lado*4;
    };
    public Figura clone() throws CloneNotSupportedException{

        Cuadrado aux = new Cuadrado(this.getLado());
        return aux;
    };
    public boolean iguales(Figura e) throws ExceptionFigura {

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

    public Cuadrado sumaAreas(Cuadrado c2){

        double ladoa = this.lado + c2.lado;

        Cuadrado aux = new Cuadrado(ladoa);

        return aux;
    }


    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
