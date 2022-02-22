public class ExamenFebrero2022 {

    public static String devolverMayorPerimetroFigura(Figura figuras[]){
        double mayorperimetro =0;
        Figura mayorfigura = null;
        String ret;

        for (int i=0;i<figuras.length;i++){
            if (mayorperimetro< figuras[i].getPerimetro()){
                mayorperimetro = figuras[i].getPerimetro();
                mayorfigura = figuras[i];
            }
        }

        ret= "El mayor perimetro es " + mayorperimetro + " y el tipo de la figura es " + mayorfigura.getClass().getName();
        return ret;
    }
    /*
    * Si no hubiese estado el metodo en la interfaz tendrias que haber comprobado
    * de que tipo era cada figura, mediante el instaceof y cast explicitos
    * */

    public static void main(String[] args) throws CloneNotSupportedException, ExceptionFigura {

        Figura figuras[] = new Figura[5];

        figuras[0] = new Circulo(3);
        figuras[1] = new Cuadrado(4);
        figuras[2] = new Rectangulo(2,5);
        figuras[3] = new Triangulo(4,6);
        figuras[4] = new Cuadrado(5);


        }//He forzado la excepcion porque no me he enterado de como calcular la hipotenusa


        /*
        System.out.println(devolverMayorPerimetroFigura(figuras));
        */
        /*
        //Apartado A
        for(int i=0; i<figuras.length;i++){

            System.out.println(figuras[i].toString());

        }

        //Apartado B
        double areatotal=0;
        for(int i=0; i<figuras.length;i++){

            areatotal += figuras[i].getArea();

        }

        System.out.println(areatotal);

        Cuadrado cuadradooriginal = new Cuadrado(3);

        Cuadrado cuadradocopia = (Cuadrado)cuadradooriginal.clone();

        System.out.println(cuadradooriginal.iguales(cuadradocopia));

        */




    }

