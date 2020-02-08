import java.util.Scanner;
/**
 * Capacidad Calorica.
 * 
 * @author John Gamboa
 * @version 1.0
 */
public class CapacidadCalorica
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite masa del agua: ");
        double masa = teclado.nextDouble();
        System.out.print("Digite la temperatura que desea: ");
        double temperatura = teclado.nextDouble();
        double c = 4.184;
        // q = m C T 
        double q = masa * c * temperatura;
        System.out.println("Cantidad Total de Energia = " + q);
    }
}
