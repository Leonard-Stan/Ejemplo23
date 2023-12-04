import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class ArraysII_4
{
    public static String dodos(int[] sum, int valor)
    {

        String sumadedos ="";

        for (int i = 0; i < sum.length ; i++)
        {
            for (int j = i + 1; j < sum.length ; j++)
            {
                if (sum[i] + sum[j] == valor)
                    sumadedos += sum[i] + "+" + sum[j]+"="+valor+" ";
            }
        }
        return (sumadedos.length() > 0  ? sumadedos : "no hay");

    }


    public static void main(String[] args)
    {
        int[] sum = {2, 1, 3, 3, 5, 9, 9, 5, 2, 7};

        int introducido;
        Scanner sc = new Scanner(System.in);

        //Utilidades.rellenaArray(sum , 1, 10);

        System.out.println(Arrays.toString(sum));
        System.out.println("Introduce un número");
        introducido = sc.nextInt();
        sc.close();
        System.out.println(dodos(sum, introducido));


    }

}
