/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionro1;
import java.util.Scanner;

/**
 *
 * @author s109e1
 */
public class EjercicioNro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner teclado=new Scanner(System.in);
        int num1;
        System.out.print("Ingrese el  valor a consultar :");
        num1=teclado.nextInt();
        
        if (num1<0 || num1 >12) 
        { 
            System.out.print("El numero ingresado no es un mes :");
        }  
        switch (num1){
            
            case 1 :
                System.out.print("El mes es enero :");
                break;
                
                 case 2 :
                System.out.print("El mes es febrero :");
                break;
                 case 3 :
                System.out.print("El mes es Marzo :");
                break;
                 case 4 :
                System.out.print("El mes es Abril :");
                break;
                 case 5 :
                System.out.print("El mes es Mayo :");
                break;
                 case 6 :
                System.out.print("El mes es Junio :");
                break;
                 case 7 :
                System.out.print("El mes es Julio :");
                break;
                
                 case 8 :
                System.out.print("El mes es Agosto :");
                break;
                
                case 9 :
                System.out.print("El mes es Septiembre :");
                break;
                
                case 10 :
                System.out.print("El mes es Octubre :");
                break;
                
                case 11 :
                System.out.print("El mes es Noviembre :");
                break;
                
                
                case 12 :
                System.out.print("El mes es Diciembre :");
                break;
                
                
        }
            
    }
    
}
