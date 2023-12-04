import java.util.Arrays;


public class ArraysII_5
{
    public static boolean iguales(int[] array1, int[] array2)
    {
        for (int i = 0; i < array1.length ; i++)
        {
            if(array1[i] != array2[i])
            {
                return false;
            }
        }return true;
    }

    public static void main(String[] args)
    {
        int[] primero = new int[10];
        int[] segundo = new int[10];

        Utilidades.rellenaArray(primero, 1, 10);
        Utilidades.rellenaArray(segundo, 1, 10);


       // segundo = primero.clone(); <--- esto los iguala para poder comprobar la igualdad.


        System.out.println("Array : "+ Arrays.toString(primero));
        System.out.println("Array : "+ Arrays.toString(segundo));

        if(iguales(primero, segundo))
        {
            System.out.println("son iguales");
        }
        else
        {
            System.out.println("no son iguales");
        }
    }

}
