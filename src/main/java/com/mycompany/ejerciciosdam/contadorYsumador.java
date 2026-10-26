package com.mycompany.ejerciciosdam;
import javax.swing.JOptionPane;
public class contadorYsumador
{
    public static void main(String[] args) 
    {
    int numero,suma=0,contador=0;
    String numeros= "";
    numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite un numero o un numero negativo para salir del programa"));
        while (numero>0)
        {
            if (contador==0)
            {
            suma= suma+numero; 
            numeros = numeros + numero+"";
            numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite otro numero o un numero negativo para salir "));    
            }
            else
            {
            suma= suma+numero; 
            numeros = numeros+", " + numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite otro numero o un numero negativo para salir "));
            }
               contador = contador+1;
        }
        JOptionPane.showMessageDialog(null,"Muchas gracias por participar.\n Usted introdujo "+ contador +" numeros y estos son \n "+ numeros + "\n Y la suma de sus numeros es "+suma);
    }
    
}
