public interface Figura {

    public double getArea();
    public double getPerimetro();
    public Figura clone() throws CloneNotSupportedException;
    public boolean iguales(Figura e) throws ExceptionFigura;



}
