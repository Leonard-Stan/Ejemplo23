import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplo33
{

    public static void main(String[] args)
    {
        int nano;
        int n1= 1;
        int n2 = 1;

        for (int i = 0; i < 40; i++)
        {
            nano = n1 + n2;
            System.out.println((double)nano / (double)n2);
            n1 = n2;
            n2= nano;

        }


    }
}