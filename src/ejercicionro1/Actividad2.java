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
public class Actividad2 {
    
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int num;
        System.out.print("Ingrese el numero deseado:");
        num=teclado.nextInt();
        if(num < 0  || num > 12 )
                {
                    System.out.print("El valor ingresado no pertenece ningun mes :");
                }
        else
        {
        switch (num) {
            case 1:
        System.out.println("El mes es enero ");
        break;
        
          case 2:
          System.out.println("El mes es febrero");
        break;
         
        case 3:
          System.out.println("El mes es Marzo");
        break;
         
        case 4:
          System.out.println("El mes es Abril ");
        break;
         
          case 5:
          System.out.println("El mes es Mayo ");
        break;
        
          case 6:
          System.out.println("El mes es Junio ");
        break;
         
        case 7:
          System.out.println("El mes es Julio ");
        break;
         
        case 8:
          System.out.println("El mes es Agosto ");
        break;
          
        case 9 :
          System.out.println("El mes es Septiembre ");
        break;
          
        case 10 :
        System.out.println("El mes es Octubre ");
        break;
        
        case 11 :
          System.out.println("El mes es Noviembre ");
        break;
        
        case 12 :
          System.out.println("El mes es Noviembre ");
        break;
            
        }
    
    }
  }  
}
