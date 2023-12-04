import java.util.Arrays;
import java.util.Scanner;
public class Arrays8
{
    public static void main(String[] args)
    {

        int pos =0;
        int neg =0;
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Introduce 10 números: ");
        for (int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();

        }
        sc.close();

        for (int numero: num){
            if (numero > 0 )
                pos += numero;
            else
                neg += numero;      neg += numero;
        }
        System.out.println("los positivos suman: " + pos + "y los negativos: "+neg);

    }
}