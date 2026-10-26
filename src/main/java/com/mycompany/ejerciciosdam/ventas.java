package com.mycompany.ejerciciosdam;
import java.util.Scanner;
public class ventas 
{
    public static void main(String[] args)
    {
    Scanner teclado = new Scanner(System.in);
    int salario=1000, comision,cantidad,precio = 0,inicio,hucha = 0;
    float extra,salariomensual;
        System.out.println("Por favor digite la cantidad de coches que ha vendido este mes ");
        cantidad = teclado.nextInt();
        for(inicio=1; inicio<= cantidad;inicio++)
        {
        System.out.println("Por favor indique el precio del coche #"+inicio);
        precio = teclado.nextInt();
        hucha  = hucha + precio;
        }
        comision = cantidad * 150;
        extra = hucha *0.05f;
        salariomensual= salario + comision+ extra;
        System.out.println("Su salario este mes es de " + salariomensual);
    }
}
