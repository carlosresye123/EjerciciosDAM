/*Ejercicio para saber si una fecha es valida o no, 
pronto are otra version donde se calculen los años bisiesto
*/
package com.mycompany.ejerciciosdam;
import javax.swing.JOptionPane;
public class Ejercicio10 
{
        public static void main(String[] args) 
    {
        int dia,mes,año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la fecha de su dia "));
        if(dia>=1 && dia<=31)
        {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero de su mes segun el numero de opcion siendo \n1.Enero\n2.Febrero\n3.Marzo\n4.Abril\n5.Mayo\n6.Junio\n7.Julio\n8.Agosto\n9.Septiembre\n10.Octubre\n11.Noviembre\n12Diciembre"));
            if(mes>=1 && mes<=12)
            {
                if(mes==2 && dia>=1 && dia<=28)
                {
                    año = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el año "));
                    if(año>=1){
                    JOptionPane.showMessageDialog(null,"Su hecha es el dia "+dia+ " del mes "+mes+" del año "+ año );
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null,"Su fecha es incorrecta ");
                    }
                }
                else if((mes==4||mes==6||mes==9||mes==11) && (dia>=1 && dia<=30))
                {
                    año = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el año "));
                    if(año>=1)
                    {
                    JOptionPane.showMessageDialog(null,"Su hecha es el dia "+dia+ " del mes "+mes+" del año "+ año );
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null,"Su fecha es incorrecta ");
                    }               
                }
                else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>=1 && dia<=31))
                {
                año = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el año "));
                    if(año>=1)
                    {
                    JOptionPane.showMessageDialog(null,"Su hecha es el dia "+dia+ " del mes "+mes+" del año "+ año );
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null,"Su fecha es incorrecta ");
                    }
                }
                else
                {
                JOptionPane.showMessageDialog(null,"Su fecha es incorrecta ");
                }
            }
            else
            {
            JOptionPane.showMessageDialog(null,"Su Fechaa es incorrecta ");
            }
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Su Fechaa es incorrecta ");
        }
    }
    
}
