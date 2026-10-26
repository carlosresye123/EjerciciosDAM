package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class Ejercicio2 {
        public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);      
            System.out.println("Hola buenas, por favor digite un numero ");
            int numero = teclado.nextInt();
            if (numero<0)
               {
                System.out.println("Hola, su numero es " + numero + " y es un numero negativo. " );
               }
            else if (numero>0)
               {
                System.out.println("Hola, su numero es " + numero + " y es positivo."); 
               }
            else
               {
                System.out.println("Hola, su numero es " + numero + " y no es negativo ni positivo.");
               }    
            }

        }
    