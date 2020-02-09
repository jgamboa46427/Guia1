import java.util.Scanner;
/**
 * Colectivo
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Colectivo
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        double preciot=10000, costot=2000;
        System.out.println("Capacidad del colectivo ? ");
        double capacidad = teclado.nextDouble();
        System.out.println("Numero de turistas ? ");
        int turistas = teclado.nextInt();
        double nviajes = turistas / capacidad;
        double ptotal = turistas * preciot;
        double propietario = turistas * costot;
        System.out.println("Viajes necesarios = " + nviajes);
        System.out.println("Pago total turistas = " + ptotal);
        System.out.println("Dinero al propietario = " + propietario);
        
    }

   
}
