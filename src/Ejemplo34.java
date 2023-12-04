import java.util.Scanner;


public class Ejemplo34
{
    public static void main(String[] args)
    {
        int num;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dos números: ");
        num = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();

        int suma = num;

        for (int i = 1; i < num2;i++ )
        {
            suma += num;

        }

        System.out.print(suma);


    }
}