/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppalarragasa6.pkg2;
import java.util.Scanner;
/**
 *
 * @author AALS
 */
public class SPPALarragaSA62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alfredo Alejandro Lárraga Sosa A01410278 LMC 
        
        Scanner kb= new Scanner(System.in);
        double factorial=1, numero;
      
        
        System.out.println("Introduce un número para sacar su factorial");
        
        numero=kb.nextDouble(); 
        
        while  (numero!=0) {
            factorial= factorial*numero; 
            numero--;
            
             {
       if (numero>=10)
            System.out.println("Fuera de rango");
       
        }
  
        }
       
        
        System.out.println("Tu factorial es"+factorial);
        
       
    }
    
}
