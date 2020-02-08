import java.util.Scanner;
/**
 * Ejercicio Aritmetica.
 * 
 * @author John Gamboa 
 * @version 1.0
 */
public class Principal
{
    public static void main (String [] args)
    {
        double a, b,suma, diferencia, producto, cociente,
        residuo, logaritmo, potencia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor de a ");
        a = teclado.nextDouble();
        System.out.print("Ingrese el valor de b ");
        b = teclado.nextDouble();
        // Calculos
        suma = a + b;
        diferencia = b - a;
        producto = a * b;
        cociente = a / b;
        residuo = a % b;
        logaritmo = Math.log10(a);
        potencia = Math.pow(a , b);
        System.out.println("La suma de a + b es" + " = " + suma);
        System.out.println("La diferencia de b - a es" + " = "+ diferencia);
        System.out.println("El producto de a y b es" + " = "+ producto );
        System.out.println("El cociente de a / b es" + " = "+  cociente);
        System.out.println("El residuo de a / b es" + " = "+ residuo);
        System.out.println("El logaritmo de a es" + " = "+ logaritmo);
        System.out.println("La potencia a^b es" + " = "+ potencia);
        
    }
}
