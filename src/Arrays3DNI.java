import java.util.Scanner;
public class Arrays3DNI

{
    public static void  main(String[] Args)
    {


        int DNI = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("introduce DNI sin letra:");

        DNI = sc.nextInt();


        sc.close();

        char[] letrasDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };

        int resto = DNI % 23;
        System.out.println("la letra es " + letrasDni[resto]);

    }
}
