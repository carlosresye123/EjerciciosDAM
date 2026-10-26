package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class EjercicioBucles1 
{
    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Por favor digite un numero y saber si es negativo o positivo o pulse 0 ya que es neutro para salir");
        numero = teclado.nextInt();
        while (numero!=0) 
        {            
         if(numero>0)
         {
             System.out.println("El numero que usted digito es "+numero+" y es positivo ");
         }   
         else
         {
             System.out.println("Usted digito "+numero+" y ese numero es negativo");
         }
            System.out.println("Recuerde pulsa 0 para salir");
            System.out.println("Por favor digite otro numero.");
            numero = teclado.nextInt();
        }
        System.out.println("Gracias por haber participado ");
    }
    
}
