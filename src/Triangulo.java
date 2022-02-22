public class Triangulo implements Figura{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) throws ExceptionFigura {

        double hipotenusa = 2;

        if(hipotenusa == (Math.pow(base,2) + Math.pow(altura,2))){
            throw new ExceptionFigura("El triangulo es equilatero");
        }

        this.base = base;
        this.altura = altura;
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

    public double getArea(){
        return (base*altura)/2;
    };
    public double getPerimetro(){
        return base+(altura*2);
    };

    public Figura clone() throws CloneNotSupportedException{
        Triangulo aux = null;
        try {
            aux = new Triangulo(this.getBase(),this.getAltura());
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

    public Triangulo sumaAreas(Triangulo c2) throws ExceptionFigura {

        double basea = this.base + c2.base;
        double alturab = this.altura + c2.altura;

        Triangulo aux = new Triangulo(basea,alturab);

        return aux;
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
