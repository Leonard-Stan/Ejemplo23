import java.util.Scanner;
import java.lang.String;
class Ejemplo7 {
    public static void main(String[] args) {
        String[] cadena = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner sc;
        sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < cadena.length; i++) {
            cadena[i] = sc.next();
        }
        for (String cadenas : cadena) // esto define la longitud de la cadena máxima
        {
            if (cadenas.length() > max)
            {
                max = cadenas.length();
            }

        }
        for (int i = 0; i < max + 4; i++) //esto imprime la primera línea de asteriscos
        {
            System.out.print("*");
        }
        System.out.println(" ");

        for (String s : cadena)  //imprime cada cadena
        {
            System.out.print("* ");
            System.out.print(s);
            for (int j = s.length(); j <= max; j++)
            {

                System.out.print(" ");
            }
            System.out.println("*");

        }
        for (int i = 0; i < max + 4; i++) //última línea de asteriscos
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}

