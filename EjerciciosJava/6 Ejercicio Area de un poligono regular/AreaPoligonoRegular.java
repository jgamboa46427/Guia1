import java.util.Scanner;
/**
 * Area Poligono Regular
 * 
 * @author John Gamboa
 * @version 1.0
 */
public class AreaPoligonoRegular
{
    public static void main (String [] args)
    {   
        System.out.println("Este programa calcula el area de un Poligono Regular");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite la longitud: ");
        double s = teclado.nextDouble();
        System.out.print("Digite el numero de lados del poligono: ");
        double n = teclado.nextDouble();
        // A = (n*s^2)/(4*tan(pi/n))
        double resultado = (n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));
        System.out.println("Area = " + resultado);
    }
}
