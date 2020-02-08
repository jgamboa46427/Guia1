import java.util.Scanner;
/**
 * Ejercicio Eficiencia de Combustible.
 * 
 * @author John Gamboa
 * @version 1.0
 */
public class EficienciaCombustible
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        double valormpg, valorlpk,equivalente;
        valorlpk=2.352145833;
        System.out.print("Ingrese el valor de una eficiencia de combustible en MPG ");
        valormpg = teclado.nextDouble();
        equivalente = valormpg * valorlpk;
        System.out.println("El equivalente en Colombia es" + " = "+ equivalente+ "LPK");
       
        
    }
}
