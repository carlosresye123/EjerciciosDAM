package com.mycompany.ejerciciosdam;
import javax.swing.JOptionPane;
public class Dolares 
{
    public static void main(String[] args) 
    {
    double Guillermo,Luis,Juan,total;
    Guillermo =Double.parseDouble(JOptionPane.showInputDialog("Guillermo por favor digete la cantidad de dolares que tienes"));
    Luis = Guillermo / 2;
    Juan = (Guillermo+Luis)/2;
    total = Guillermo+Juan+Luis;
    JOptionPane.showMessageDialog(null,("La cantidad que tiene Guillermo es "+ Guillermo + " \nLa cantidad que tiene Luis es " + Luis + "\nLa cantidad que tiene Juan es " + Juan + "\nY el total de todos los dolares es " + total));
    }
    
}
