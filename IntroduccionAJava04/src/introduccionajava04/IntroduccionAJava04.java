
package introduccionajava04;

import java.util.Scanner;


public class IntroduccionAJava04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados centigrados: ");
        double gradosCentigrados = leer.nextDouble();
        
        double gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        
        System.out.println(gradosCentigrados + " grados centígrados equivalen a " + gradosFahrenheit + " grados Fahrenheit.");
        
        
        
        
    }
    
}
