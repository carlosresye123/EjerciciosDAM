import java.util.Scanner;

public class Main 
{
        public static void main(String[] args)
        {

                Scanner teclado = new Scanner(System.in);
                System.out.println("Hola buenas, cual es tu nombre");
                String nombre = teclado.nextLine();
                System.out.println("Hola "+ nombre + " Dime, de que ciudad eres?");
                String ciudad = teclado.nextLine();
                System.out.println("Hola "+ nombre+" de "+ ciudad+ " ¿cuál es tu edad?");
                int edad = teclado.nextInt();
                if (edad<18) {
                System.out.println("Hola " + nombre + " de " + ciudad+ " tu edad es "+ edad + " y eres menor de edad.");    
                }
                else if (edad>=18&&edad<=64) {
                 System.out.println("Hola "+  nombre + " de " + ciudad + " tu edad es " + edad + " y eres un adulto "
                 );   
                }
                else {
                System.out.println("Hola " + nombre + " de " + ciudad+ " tu edad es "+ edad + " y eres un adulto mayor.");
                }
        }
}