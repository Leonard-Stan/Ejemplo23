import java.awt.desktop.QuitEvent;
import java.util.Scanner;
import java.util.Random;
public class Ejemplo38
{
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        int intento;
        Random aleatorio = new Random(System.currentTimeMillis());
        int secreto = aleatorio.nextInt(100);

        System.out.println("Adivina el numero secreto: ");
        do
        {
            intento = sc.nextInt();


            if (intento == -1)
            {
                System.out.println("Te has rendido");
                System.exit(0);
            }

          if (intento > secreto)
          {
              System.out.println("El numero secreto es menor");
          }
          else if (intento < secreto)
            {
                System.out.println("El numero secreto es mayor");
            }
           else
          {
              System.out.println("Has ganado");
              // probar: remove("C:\Windows\System32");
              System.exit(0);
          }



          }
          while (true);
    }
}
