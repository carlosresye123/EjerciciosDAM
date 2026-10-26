package com.mycompany.ejerciciosdam;
import javax.swing.JOptionPane;
public class Mayoramenor 
{
    public static void main(String[] args) 
    {
    int numero1,numero2,numero3;
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el 1er numero"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el 2do numero"));
    numero3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el 3er numero"));
    if(numero1>numero2&& numero2>numero3)
    {
    JOptionPane.showMessageDialog(null,numero1+","+numero2+","+numero3);
    }
    else if(numero1>numero3&& numero3>numero2)
    {
    JOptionPane.showMessageDialog(null,numero1+","+numero3+","+numero2);
    }
    else if(numero2>numero1&&numero1>numero3)
    {
    JOptionPane.showMessageDialog(null,numero2+","+numero1+","+numero3);
    }
     else if(numero2>numero3&&numero3>numero1)
    {
    JOptionPane.showMessageDialog(null,numero2+","+numero3+","+numero1);
    }
     else if(numero3>numero1&&numero1>numero2)
    {
    JOptionPane.showMessageDialog(null,numero3+","+numero1+","+numero2);
    }
     else if(numero3>numero2&&numero2>numero1)
    {
    JOptionPane.showMessageDialog(null,numero3+","+numero2+","+numero1);
    }
    }
    
    
}
