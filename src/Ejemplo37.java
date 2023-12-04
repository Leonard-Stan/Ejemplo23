import java.util.Scanner;

public class Ejemplo37

{
    public static void main(String[] args)

    {
        int numero;
        int digito;
        String Binario = "";
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce un número del 0 al 255");
        numero = sc.nextInt();
        sc.close();


        while (numero !=0)
        {
            digito = numero % 2;
            Binario = digito + Binario;
            numero = numero /2;
        }

        System.out.println(Binario);
    }
}
