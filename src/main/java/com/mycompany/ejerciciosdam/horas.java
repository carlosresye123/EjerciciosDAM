package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class horas
{
    public static void main(String[] args) 
    {
    Scanner  teclado = new Scanner(System.in);
    int semanas,dias,horasres,horas;
        System.out.println("Por favor digite una cantidad de horas ");
        horas = teclado.nextInt();
        semanas = horas /168;
        dias = horas%168/24;
        horasres=horas%24;
        System.out.println("Semanas"+ semanas + ", Dias" + dias + ", Horas"+horasres);
    }
}
