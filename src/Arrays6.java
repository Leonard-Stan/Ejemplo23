import java.util.Scanner;
public class Arrays6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Introduce 10 números: ");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++)
        {
            num[i] = sc.nextInt();

            if(num[i] < min)
            {
                min = num[i];
            }

        }
        System.out.println("el número más pequeño es: " + min);

    }


}