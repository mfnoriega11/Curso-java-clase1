/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionro1;

/**
 *
 * @author s109e1
 */
public class Operadores {
    
  private  static int numeroA;
  private static int NumeroB;
    
    public static void main (String[] args) {
        
        numeroA=13;
        NumeroB=10;
      // Operador modulo
      int resultadoModulo = numeroA % 2;
      System.out.println("El modulo es :" + resultadoModulo);
     
      //Operador Incremento
      numeroA ++;
      int Resultadoincremento= numeroA;
       System.out.println("El incremento  es :" + Resultadoincremento);
       
      NumeroB --;
      
       int Resultadodecremento= NumeroB;
       System.out.println("El decremento  es :" + Resultadodecremento);
       
       // Varoanñe boolean tiene dos resultados verdadero o falso
       
       boolean estaVivo = true;
       estaVivo = !estaVivo;
       System.out.println("El resultado   es :" + estaVivo);
       
       String inicialNombre="A";
       switch (inicialNombre) {
        
        case "A":
        System.out.println("Caso A");
        break;
               
             }
       
    }
    
}
