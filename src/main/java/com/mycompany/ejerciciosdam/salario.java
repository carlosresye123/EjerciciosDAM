package com.mycompany.ejerciciosdam;
import javax.swing.JOptionPane;
public class salario 
{
public static void main(String[] args)
    {
    double horas, salario,salariomensual;
    horas = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite la cantidad de horas trabajadas esta semana "));
    salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor indique su salario por hora "));
    salariomensual = horas * salario;
    JOptionPane.showMessageDialog(null,("Su salario esta semana es " + salariomensual));
    }
}

