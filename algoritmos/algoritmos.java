/* Karen Pineda Acevedo                                          TdeA
    Stiven Alexander Parra Hincapie                        2021
    Estructura de datos 
    Taller de Algoritmos Recursivos
*/
package com.mycompany.algoritmos;

import java.util.*;

public class algoritmos {

//Punto 1°A: suma iterativa
    public double Iterativo(double numero1){
        double total = 0;
                for (long i = 1; i <= numero1; i++) {
            total = (1.0/i) + total;
                }
        return total;
    }
    //Punto 1°B: suma recursiva
     public static double Recursiva(double numero1) {
            if (numero1 == 1){
            return 1;
            }else{
            return (1 / (double)numero1) + Recursiva(numero1 - 1);
            }
     }
     
    //punto 2°A: Convertir iterativo a recursivo
     /*CODIGO ITERATIVO 
     
         static public double loge() {
              double en1, delta, fact;
              int n;
              en1 = fact = delta = 1.0;
              n = 1;
              do {
                en1 += delta;
                n++;
                fact * = n:
                delta = 1.0/ fact;
              } while ( en1 != en1 + delta);
                  return en1;
       }
     */
         public static double loge(int n) {
             if(n == 0){
               return 1;
         }else{
              return (1 / (double)fact(n)) + loge (n - 1);
             }
       }
       public static int fact( int n){
           if(n == 1){
               return 1;
           }else{
               return n * fact(n - 1);
           }
       }
         
       // punto 3°A: explicacion de error
       /*
       Codigo a revisar
       static public long factorial (long n) {
           if ( n == 0 | | n == 1)
               return 1; 
           else 
               return n * factorial (--n);
       */
         static public long factorial (long n) {
           if ( n == 0 || n == 1){
               return 1; 
           } else {
               return n * factorial (--n);
           }
           /*
           Expicacion:
           Encontramos que el error era el espacio entre las barras (El operador(O)) y vimos que en el codigo original no tenia las llaves en los condicionales ({ })
           aunque no nos daba error por eso, pero es de buena practica usarlas y ponerlas, pero al buscar el factorial de cualquier numero el resultado nos dara correcto.
           */
       }
         
        // punto 4°A: secuencia numerica N°1
         long f (int n) {
             if ( n == 0|| n == 1){
             return 1;
             }else{                         
             return 3 * f(n - 2) + 2 * f ( n - 1);
             }
             /*Respuesta: Al llamar la secuencia numerica de f(5) nos da como resultado 121, francamente el resultado es incorrecto ya que nos da 121 si le restamos 1 al 
             resultado nos daria 120 y ya 120 si es la secuencia numerica de 5.
             
             */
         }

         // punto 5°A: secuencia numerica N°2
         long F (int n) {
             if( n == 0 || n == 1){
             return 1;
             }else{ if(n % 2 == 0){
             return 2 + f ( n -1);
             }else{
                 return 3 + f(n-2);
             }
             /*Respuesta: Al llamar la secuencia numerica de f(8) nos da como resultado 1095, francamente el resultado es incorrecto ya que nos da 1095 si le sumamos 1 al 
               resultado nos daria 1096 y ya 1096 si es la secuencia numerica de 8.
             
             */
           }
         }
     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        algoritmos a = new algoritmos();
        
         System.out.println("ingrese numeros :");
         double numero1 = leer.nextDouble();
  
         System.out.println(" la suma iterativa es :" + a.Iterativo(numero1));
         System.out.println(" la suma recursiva es :" +  a.Recursiva(numero1));
         System.out.println(" respuesta de codigo covertido en iterativo intentando hallar un resultado similar al numero e es  :" + a.loge(8));
         System.out.println(" El factorial es :" + a.factorial(5));
         System.out.println(" la secuencia numerica del problema 4 es :" + a.f(5));
         System.out.println(" la secuencia numerica del problema 5 es :" + a.F(8));
     
    }
}
