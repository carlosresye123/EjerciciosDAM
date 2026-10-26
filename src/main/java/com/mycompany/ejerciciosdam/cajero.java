package com.mycompany.ejerciciosdam;
import javax.swing.JOptionPane;
public class cajero 
{
    public static void main(String[] args) 
    {
    float saldores,retiro,saldo=1000f,ingreso,saldomas;    
    int opcion;
    opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido\nEste es su cajero de confianza\nPor favor digite la opcion de la operacion que quisiera realiza\n1.Retiro\n2.Ingreso\n3.Salir "));
    if(opcion==1)
    {
        retiro = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite la cantidad a retirar "));
        if (retiro<=saldo)
        {    
        saldores= saldo-retiro;
        JOptionPane.showMessageDialog(null,"Su retiro de "+retiro+" a sido exitoso y su saldo es "+ saldores);
        }
        else 
        {
        JOptionPane.showMessageDialog(null,"Lo siento, no cuenta con saldo suficiente para su retiro ");
        }
        
    }
    else if(opcion==2)
    {
        ingreso = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite la cantidad a ingresar "));
        saldomas = ingreso+saldo;  
        JOptionPane.showMessageDialog(null,"Su ingreso de "+ingreso+" a sido exitoso y su saldo actual es "+saldomas);
    }
    else if(opcion==3)
    {
    JOptionPane.showMessageDialog(null,"Gracias por su visita ");
    }
    else
    {
    JOptionPane.showMessageDialog(null, "Lo siento, su opcion no es valida ");
    }
    }
}
