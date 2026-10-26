package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class obrero 
{
    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    int horas;
    float salariosemanal;
        System.out.println(" Por favor digite la cantidad de horas trabajadas esta semana");
        horas = teclado.nextInt();
        if(horas<=40)
        {
        salariosemanal = horas*16;
            System.out.println("Su salario esta semana es " + salariosemanal);
        }
        else
        {
        salariosemanal = (40*16)+((horas-40)*20);
        System.out.println("Su salario esta semana es "+ salariosemanal);
                
        }
    }
   
}
