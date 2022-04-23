
package uspg.edu.gt.tercerejercicio;

import java.util.Scanner;

/**
 *
 * @author Andrea Erazo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
   
    static String expresiones;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Duplicado duplicado = new Duplicado();
        boolean salir = false;
        while (salir!=true){
            System.out.println("Escriba la expresión");
            expresiones = sc.next();
            
            if(duplicado.Duplicado(expresiones)){
                System.out.println("Hay parentesis repetidos");
             
                
            }else{
                System.out.println("No hay parentesis repetidos");
                
            }
            
            System.out.println("¿Quisieras salir?");
            
            int eleccion =sc.nextInt();
            
            switch(eleccion){
                
                case 1: salir = true ;
                
                break;
                
                case 2: salir = false;
                
                break;
                
                default: System.out.println("Se repetira a falta de eleccion concisa");
                
                break;
            }
        }
        
    }
    
}
