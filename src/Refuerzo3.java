import java.util.Scanner;


public class Refuerzo3

{
    public static void main (String[] argv)
    {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un número: ");
        x = sc.nextInt();
        System.out.println("introduce otro número: ");
        y = sc.nextInt();

        if (x % y ==0)
        {
            System.out.println(x +" es múltiplo de " +y);
        } else {
            System.exit(0);
        }
    }
}
