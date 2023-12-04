import java.util.Scanner;
public class Arrays5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        ;
        System.out.println("Introduce 10 números: ");
        int max = num[0];
        for (int i = 0; i < 10; i++)
        {
          num[i] = sc.nextInt();

          if(num[i]> max)
          {
              max = num[i];
          }

        }
        System.out.println("el número más grande es: " + max);

    }


}
