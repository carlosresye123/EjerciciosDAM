//Ejercicio para resolver  la ecucacion cuadratica
package com.mycompany.ejerciciosdam;

import javax.swing.JOptionPane;

public class ecucacioncuadratica
{ 
    public static void main(String[] args) 
    {
     double a,b,c,raiz,resultado,r1,r2,r3;
     a = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite el valor para a"));
     b = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite el valor para b"));
     c = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite el valor para c"));
     raiz = b*b - 4*a*c;
     resultado = Math.sqrt(raiz);   
     if(raiz>0)
     {
     r1 = (-b+resultado)/(2*a);
     r2 = (-b-resultado)/(2*a);
     JOptionPane.showMessageDialog(null," Su Ecuacion tiene dos resoltados y son "+ r1 + " y " + r2);
     }        
     else if (raiz==0) 
     {
     r3 = -b/(2*a);
     JOptionPane.showMessageDialog(null,"Su ecuacion solo tiene una solucion real y es "+ r3);
     }
     else
     {
     JOptionPane.showMessageDialog(null," Su ecuacion no tiene soluciones reales");
     } 
    }
}
