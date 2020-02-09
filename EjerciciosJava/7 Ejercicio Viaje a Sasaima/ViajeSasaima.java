import java.util.Scanner;
/**
 * Viaje Sasaima
 * 
 * @author John Gamboa
 * @version 1.0
 */
public class ViajeSasaima
{
 
    
    public static void main (String [] args)
    {
        double preciog=10000, distancia=85;
        System.out.println("Viaje a Sasaima");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Capacidad del caminon en kilos?: ");
        double capacidad = teclado.nextDouble();
        System.out.println("Consumo km por galon del camion?: ");
        double consumo = teclado.nextDouble();
        System.out.println("Cuantos kilos va a llevar?: ");
        double kilos = teclado.nextDouble();
        double nviajes = kilos / capacidad;
        double ngalones = (distancia / consumo)*nviajes;
        double costo = ngalones * preciog* nviajes;
        System.out.println("Viajes necesarios = " + nviajes);
        System.out.println("Cantidad de galones = " + ngalones);
        System.out.println("Costo = " + costo);
        
    }
}
