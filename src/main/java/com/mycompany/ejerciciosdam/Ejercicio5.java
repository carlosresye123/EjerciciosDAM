package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class Ejercicio5 
{
   public static void main(String[] args) 
   {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor digite su primer numero ");
        int numero1 = teclado.nextInt();
        System.out.println("Por favor digite su segundo numero");
        int numero2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Por favor digite el numero de la operacion que quiere realizar, siendo las opciones\n1.Suma\n2.Resta\n3.Division \n4.Multipicacion"); 
        int operacion = teclado.nextInt();
        if (operacion==1)
        {
        int resultado = numero1+numero2;
        System.out.println(" Usted quiere una suma y el resultado de su primer numero "+ numero1 + (" y su segundo numero que es ") + numero2 + (" es = " + resultado ));
        }
        else if (operacion==2)
        {
        int resultado = numero1-numero2;
        System.out.println(" Usted quiere una resta y el resultado de su primer numero "+ numero1 + (" y su segundo numero que es ") + numero2 + (" es = " + resultado ));    
        }
        else if (operacion==3)
        {
        int resultado = numero1/numero2;
        System.out.println(" Usted quiere una division y el resultado de su primer numero "+ numero1 + (" y su segundo numero que es ") + numero2 + (" es = " + resultado ));   
        }
        else if (operacion==4)
        {
        int resultado = numero1*numero2;
        System.out.println("Usted quiere una Multiplicacion y el resultado de su primer numero "+ numero1 + (" y su segundo numero que es ") + numero2 + (" es = " + resultado ));    
        }
        else
        {
        System.out.println("Su operacion no es valida");  
        }

    }
    






}
