import java.util.Scanner;
public class Ejercicio4 
{
   public static void main(String[] args) 
   {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Por favor degite su edad ");
    int edad = teclado.nextInt(); 
    System.out.println("Tienes carnet de contudir? true/false");
    boolean carnet = teclado .nextBoolean();
    if (edad>=18&&carnet==false) 
    {
    System.out.println("Usted es mayor de edad pero no puede conducir");
    }
    else if (edad>=18&&carnet==true)
    {
    System.out.println("Usted puede conducir");    
    }
    else
    {
    System.out.println("Usted es menor de edad y no puede conducir");    
    }

    
    }


}
