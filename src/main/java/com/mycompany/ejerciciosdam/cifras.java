package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class cifras 
{
    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor digite un numero");
        int numero = teclado.nextInt();
        if(numero>=1 && numero<=9)
        {
            System.out.println("Su numero es de una cifras ");
        }
        else if(numero>=10 && numero<=99)
        {
            System.out.println("Su numero es de dos cifras ");
        }
        else if(numero>=100 && numero<=999)
        {
            System.out.println("Su numero es de tres cifras ");
        }
        else if(numero>=1000 && numero<=9999)
        {
            System.out.println("Su numero es de cuatro cifras ");
        }
        else if(numero>=10000 && numero<=99999)
        {
            System.out.println("Su numero es de cinco cifras ");
        }
        else if(numero>=100000 && numero<=999999)
        {
            System.out.println("Su numero es de seis cifras ");
        }
        else if(numero==1000000)
        {
            System.out.println("Su numero es de siete cifras ");
        }
        else
        {
            System.out.println("Su numero tiene que estar en un rango de 1 a 1 millon");
        }
    }
    
    
}
