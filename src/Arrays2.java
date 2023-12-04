import java.util.Scanner;

public class Arrays2
{
    public static void main(String[] args)
    {
        int[] array1 = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los diez dígitos: ");

        for (int i = 0; i < 10; i++)
        {
            array1[i] = sc.nextInt();
        }


        sc.close();

        for (int i = array1.length - 1; i >=0 ; i--)
        {
            System.out.println(array1[i]);
            
        }
    }
}
