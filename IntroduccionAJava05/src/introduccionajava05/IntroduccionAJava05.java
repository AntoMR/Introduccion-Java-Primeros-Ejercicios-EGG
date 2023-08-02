
package introduccionajava05;

import java.util.Scanner;


public class IntroduccionAJava05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese un numero entero");
            int numero = leer.nextInt();
            
            int doble = numero * 2;
            int triple = numero * 3;
            double raizCuadrada = Math.sqrt(numero);
            
        System.out.println("El doble de " + numero + " es: " + doble);
        
        System.out.println("El triple de " + numero + " es: " + triple);
        
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        
    }
    
}
