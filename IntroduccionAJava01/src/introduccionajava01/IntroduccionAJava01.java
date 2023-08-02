
package introduccionajava01;

import java.util.Scanner;


public class IntroduccionAJava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero entero");
        int numero1 = leer.nextInt();
        
        System.out.println("Ingrese el seguno numero entero");
        int numero2 = leer.nextInt();
        
        int suma = (numero1 + numero2);
        
        System.out.println("La suma de los dos numero es  " + suma);
        
       
    }
    
}
