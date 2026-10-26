package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class String2 
{ 
    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    String usuario;
        System.out.println("Por favor digite su usuario");
        usuario = teclado.nextLine();
        if(usuario.equals("Carlos"))
        {
            System.out.println("Bienvenido "+usuario);
        }
        else
        {
            System.out.println("Usuario incorrecto.");
        }
    }
}
