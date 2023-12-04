import java.util.Scanner;

public class Ejemplo23

{
    public static void main(String argv[])
    {
        int num;
        int pos = 0;
        int neg = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("intoduce numeros enteros: ");
        do
        {
            num = sc.nextInt();

            if(num !=0)
            {
                if (num>0)
                {
                    pos++;
                }

                neg++; //¿Por qué aumenta?
            }

        }
        while(num!=0);
        sc.close();
        System.out.println("Ha introducido " + pos + " números positivos");
        System.out.println("Ha introducido " + (num - pos) + " números negativos");
    }
}
