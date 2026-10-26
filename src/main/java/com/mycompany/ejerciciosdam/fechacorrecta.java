package com.mycompany.ejerciciosdam;
import javax.swing.JOptionPane;
public class fechacorrecta 
{
    public static void main(String[] args) 
    {
        int dia,mes,año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la fecha de su dia."));
        if(dia>0 && dia <31)
        {
             mes = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero de su mes segun el numero de opcion siendo \n1.Enero\n2.Febrero\n3.Marzo\n4.Abril\n5.Mayo\n6.Junio\n7.Julio\n8.Agosto\n9.Septiembre\n10.Octubre\n11.Noviembre\n12Diciembre"));
             if(mes>0 && mes<13)
                {
                año = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el año "));  
                    if(año>0)
                    {
                    JOptionPane.showMessageDialog(null,"Su hecha es el dia "+dia+ " del mes "+mes+" del año "+ año );
                    }
                    else 
                    {
                    JOptionPane.showMessageDialog(null," Su fecha es incorrecta ");
                    }
                }
             else 
             {
             JOptionPane.showMessageDialog(null," Su fecha es incorrecta ");
             }

        }
        else 
        {
        JOptionPane.showMessageDialog(null," Su fecha es incorrecta ");
        }
    }
}
