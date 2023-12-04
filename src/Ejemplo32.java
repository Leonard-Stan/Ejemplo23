import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplo32
{

    public static void main(String[] args)
    {
        int t = 0;
        int n1= 1;
        int n2 = 1;
        System.out.println(n1);
        for (int i = 0; i < 40; i++)
        {
            t = n1 + n2;
            n1 = n2;
            n2= t;
            System.out.println(t);
        }


    }
}
