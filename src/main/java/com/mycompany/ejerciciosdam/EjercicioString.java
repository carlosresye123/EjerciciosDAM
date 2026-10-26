package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class EjercicioString 
{
    public static void main(String[] args) 
    {
     Scanner teclado = new Scanner(System.in);
        String nombre,apellido,ciudad;
        int edad;
        System.out.println("Por favor digame su nombre ");
        nombre = teclado.nextLine();
        System.out.println("Por favor digame su apellido ");
        apellido = teclado.nextLine();
        System.out.println("Por favor digiteme su edad ");
        edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Por favor "+nombre+" "+apellido+" digame su ciudad de residencia ");
        ciudad = teclado.nextLine();
        System.out.println(" Hola "+nombre+" "+apellido+" con edad "+edad+" y lugar de residencia "+ciudad );
    }
    
}
