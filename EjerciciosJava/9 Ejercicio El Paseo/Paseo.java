import java.util.Scanner;
/**
 * Paseo.
 * 
 * @author John Gamboa
 */
public class Paseo
{
 public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        double capacidadbus=60, costoplato=10000;
        int gordoscomen=5 , flacoscomen=3;
        int capacidadhabitacion= 4, costohabitacion=25000;
        System.out.println("Cuantos Gordos ? ");
        double ngordos = teclado.nextDouble();
        System.out.println("Cuantos Flacos ? ");
        double nflacos = teclado.nextDouble();
        System.out.println("Dias que dura el paseo ? ");
        int ndias = teclado.nextInt();
        double nbuses = ((ngordos*2)+nflacos)/capacidadbus;
        System.out.println("Numero de buses = " + nbuses);
        double nplatos = ((ngordos*5)+(nflacos*3))* ndias;
        System.out.println("Numero de platos = " + nplatos);
        double costototalplatos = nplatos * costoplato;
        System.out.println("Costo total platos = " + costototalplatos);
        double nhabitaciones = (ngordos+nflacos)/capacidadhabitacion;
        System.out.println("Numero de habitaciones = " + nhabitaciones);
        double chpordia = nhabitaciones * costohabitacion;
        System.out.println("Costo total habitaciones por dia = " + chpordia);
        double chpaseo = chpordia * ndias;
        System.out.println("Costo total habitaciones paseo = " + chpaseo);
        
        
        
    }
}
