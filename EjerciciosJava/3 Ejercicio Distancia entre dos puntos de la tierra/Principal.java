import java.util.Scanner;
/**
 * Ejercicio Distancia entre dos puntos de la tierra.
 * 
 * @author John Gamboa
 * @version 1.0
 */
public class Principal
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        double t1,g1,t2,g2, distancia;
        System.out.print("Ingrese latitud ciudad 1 ");
        t1 = teclado.nextDouble();
        System.out.print("Ingrese longitud ciudad 1 ");
        g1 = teclado.nextDouble();
        System.out.print("Ingrese latitud ciudad 2 ");
        t2 = teclado.nextDouble();
        System.out.print("Ingrese longitud ciudad 2 ");
        g2 = teclado.nextDouble();
        //distancia = 6371.07 * arccos sin t1 * sin t2 + cos t1 * cos t2 * cos g1 - g2;
        distancia = 6371.07 * Math.acos (Math.sin(t1))*Math.sin(t2)+Math.cos(t1)*Math.cos(t2)*Math.cos(g1)-g2;
        System.out.print("La distancia es " + " " + distancia);
      
       
        
    }
}
