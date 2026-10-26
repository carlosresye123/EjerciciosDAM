import java.util.Scanner;
public class Ejercicio3 
{

     public static void main(String[] args)
     {
     Scanner teclado = new Scanner(System.in);
     System.out.println("Por favor digite su edad ");
     int edad = teclado.nextInt();
     if (edad>=0&&edad<13) 
        {
        System.out.println("Usted es un niño");
        }
     else if (edad>12&&edad<18)
        {
        System.out.println("Usted es un adolescente");    
        }   
     else if (edad>=18&&edad<=64)
        {
        System.out.println("Usted es un adulto");
        }
     else
        {
        System.out.println("Ustes es un adulto mayor");
        }  
     }
}
