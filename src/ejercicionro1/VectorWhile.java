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
public class VectorWhile {
    
     private Scanner teclado;
    private String [] dias ;
	
    public void cargar()
    {   int i;
        teclado=new Scanner(System.in);
        dias=new String [7];
        i=0;
        while (i<7) 
        {
            System.out.print("Ingrese dia de la semana :"+ (i+1));
            dias [i]=teclado.nextLine();
            
            i++;
        }	
    }
	
    public void imprimir() {
        int i=0;
        while (i<7)  {
            System.out.print(" EL dia ingresado es del while :");
            System.out.println(dias[i]);
            i++;
        }
    }
	
    public static void main(String[] ar) {
        PruebaVector1 pv=new PruebaVector1();
        pv.cargar();
        pv.imprimir();
    }
}
