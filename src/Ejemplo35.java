import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplo35
{

    public static void main(String[] args)
    {
     int dividendo;
     int divisor;
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce dos números: ");
     dividendo = sc.nextInt();
     divisor= sc.nextInt();
     sc.close();



        while (dividendo >= divisor)
        {
            dividendo -=divisor;
        }
        System.out.println(dividendo);


    }



}