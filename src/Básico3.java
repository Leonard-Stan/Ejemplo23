import java.util.Scanner;


public class Básico3

{
        public static void main (String[] argv)
        {
            int x;
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce un número: ");
            x = sc.nextInt();

            System.out.println("El doble de: "+ x + " es: "+ (x*2) + " y el triple es: " +(x*3));
        }
}
