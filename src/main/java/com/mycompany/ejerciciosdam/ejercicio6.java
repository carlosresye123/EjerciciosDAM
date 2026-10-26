package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class ejercicio6 
{
    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    int a,b,resultado;
        System.out.println("Por favor indique el valor para a");
        a = teclado.nextInt();
        System.out.println("Por favor indique el valor para b");
        b = teclado.nextInt();
        resultado = a*a+b*b+2*a*b;
        System.out.println("El resultado de su ecuacion es " + resultado);
    }
}
