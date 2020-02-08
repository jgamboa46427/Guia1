import java.util.Scanner;
/**
 * Ejercicio Area y Volumen.
 * 
 * @author John Gamboa
 * @version 1.0
 */
public class Principal
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio: ");
        double r = teclado.nextDouble();
        double area = Math.PI * Math.pow(r,2);
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(r,3);
        System.out.println("area = " + area);
        System.out.println("volumen = " + volumen);
    }
}
