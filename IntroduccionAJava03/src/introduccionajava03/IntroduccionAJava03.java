
 
package introduccionajava03;

import java.util.Scanner;


public class IntroduccionAJava03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        String fraseMayuscula = frase.toUpperCase();
        String fraseMinusculas = frase.toLowerCase();
        
        System.out.println("La frase en mayusculas es " + fraseMayuscula);
        System.out.println("La frase en minusculas es " + fraseMinusculas);
        
        
    }
    
}
