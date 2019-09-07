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
public class PruebaVector1 {
    
    private Scanner teclado;
    private String [] dias ;
	
    public void cargar()
    {
        teclado=new Scanner(System.in);
        dias=new String [7];
        for(int f=0;f<7;f++) {
            System.out.print("Ingrese dia de la semana :");
            dias [f]=teclado.nextLine();
        }	
    }
	
    public void imprimir() {
        for(int f=0;f<7;f++) {
            System.out.print(" EL dia ingresado es  :");
            System.out.println(dias[f]);
        }
    }
	
    public static void main(String[] ar) {
        PruebaVector1 pv=new PruebaVector1();
       /** pv.cargar();
          pv.imprimir();*/
       /** pv.impresionMatriz();*/
       /**pv.Mostrarnumeros1al100for();*/
         /** pv.Mostrarnumeros100al1for();*/
          /** pv.paresfor();*/
          /**pv.sumafor();*/
           /** pv. asteriscosfor();*/
            pv.Mostrarnumeros1al100while();
          
    }


public  void impresionMatriz(){

 int [][] miMatriz = new int [5][4];
  miMatriz [2][2]=5;
  miMatriz [4][3]=5;
  for(int fila = 0;fila <5; fila++)
  { for (int columna = 0; columna < 4; columna++) 
     {
       System.out.print(miMatriz[fila][columna]);
     }
      System.out.println();
  }
  
  
}

 public void Mostrarnumeros1al100for ()
    {   
        
        for(int i = 1 ; i <=  100 ; i++) {
        System.out.print(" los valores son  :");
        System.out.println(i);
    }
 

}
 
 
 public void Mostrarnumeros1al100while ()
    {   
        int i=0;
       
        while(i <=  100)
        {
        System.out.print(" los valores son  :");
        System.out.println(i);
        i++;
    }
 

}
 
 public void Mostrarnumeros100al1for ()
    {   
       
        for(int i = 100 ; i >=1 ; i--) {
        System.out.print(" los valores son  :");
        System.out.println(i);
    }
 
        
        
   }

 public void paresfor ()
 
 {   
       
         for(int i = 1 ; i <=  150 ; i++) {
           
             if (i%2==0)
             {
               System.out.println(i);
             }
         
         }
             
        
    
    
    }
 
 public void sumafor ()
 
 {     int sum =0;
       
         for(int i = 1 ; i <=  200 ; i++) {
           
             sum = sum+i;
         
         }
         System.out.print(" la suma de los valores del 1 al 200 son  :");    
         System.out.println(sum);
        
    
    
    }


public void asteriscosfor ()
 
 {      
     Scanner teclado=new Scanner(System.in);
         int num;
            num=0;
       
        System.out.print("Ingrese el numero deseado:");
         num=teclado.nextInt();;
     
         for(int i = 1 ; i <= num ; i++) 
         {
           
           System.out.println("*");
            
        }
        
        
    }



}





