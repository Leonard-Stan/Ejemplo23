import java.util.Scanner;

public class Ejemplo22

{
    public static void main(String argv[])

    {
        int num;
        int pos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce diez numeros");

        for(int i = 0; i < 10; i++ )
        {
            num = sc.nextInt();

            if(num >=0)
            {
                pos++;
            }
        }

        sc.close();

        System.out.println("Has puesto " + pos + " numeros positivos");
        System.out.println("Has puesto "+ (10- pos) + " numeros negativos");
    }
}