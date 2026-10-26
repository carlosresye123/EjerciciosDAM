package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class paroimpar 
{
    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor digite un numero para saber si es par o impar ");
        int numero1 = teclado.nextInt();
        System.out.println("Por favor digite un 2do numero para saber si es par o impar");
        int numero2 = teclado.nextInt();
        if(numero1 % 2==0 && numero2 % 2==0)
        {
            System.out.println(" El numero "+ numero1 +" es par y el numero "+ numero2+" tambien es par ");
        }
        else if(numero1 % 2!=0 && numero2 % 2==0)
        {
            System.out.println(" El numero "+ numero1 +" es impar pero el numero "+ numero2+" es par ");
        }
        else if(numero1 % 2==0 && numero2 % 2!=0)
        {
            System.out.println(" El numero "+ numero1 +" es par pero el numero "+ numero2+" es impar ");
        }
        else
        {
            System.out.println("El numero " + numero1 + " es impar y tambien el "+ numero2 +" es impar" );
        }
    }
    
}
