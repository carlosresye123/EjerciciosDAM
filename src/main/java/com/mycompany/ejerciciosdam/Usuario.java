package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class Usuario 
{
    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    String usuario,contraseña;
    int edad;
        System.out.println("Por favor digite su nombre se usuario ");
        usuario = teclado.nextLine();
        System.out.println("Por favor digite su contraseña ");
        contraseña = teclado.nextLine();
        System.out.println("Por favor digite su edad ");
        edad = teclado.nextInt();
        teclado.nextLine();
        if(contraseña.equals("ElReyExanime"))
        {
            System.out.println("Hola "+ usuario+ " Bienvenido.");
        }
        else
        {
            System.out.println("Contraseña incorrecta ");
        }
    }
    
}
