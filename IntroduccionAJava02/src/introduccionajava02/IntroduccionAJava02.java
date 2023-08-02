
package introduccionajava02;

import java.util.Scanner;


public class IntroduccionAJava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre ");
        String nombre = leer.nextLine();
        
        System.out.println("Hola! " + nombre + " Bienvenida!!!");
        
        
       
    }
    
}
