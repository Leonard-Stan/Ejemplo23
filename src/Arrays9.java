import java.util.Scanner;
public class Arrays9
{
    public static void main(String[] args)
    {

        int par =0;
        int impar =0;
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Introduce 10 números: ");
        for (int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();

        }
        sc.close();

        for (int numero: num){
            if (numero %2 == 0 )
                par ++;
            else
                impar++;
        }
        System.out.println("hay tantos pares: " + par + " hay tantos impares: "+impar);

    }
}