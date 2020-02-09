import java.util.Scanner;
/**
 * TronoCono
 * 
 * @author John Gamboa
 * 
 */
public class TroncoCono
{
  public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        double r1,h1,r2,h2;
        System.out.println("Ingrese r1 = " );
        r1 = teclado.nextDouble();
        System.out.println("Ingrese h1 = " );
        h1 = teclado.nextDouble();
        System.out.println("Ingrese r2 = " );
        r2 = teclado.nextDouble();
        System.out.println("Ingrese h2 = " );
        h2 = teclado.nextDouble();
        double vcompleto = (Math.PI*Math.pow(r1,2))*h1;
        double vdeficiente = (Math.PI*Math.pow(r2,2))*h2;
        double vtroncodecono = vcompleto-vdeficiente;
        System.out.println("Volumen de tronco de cono = " + vtroncodecono);
        
    }
}
