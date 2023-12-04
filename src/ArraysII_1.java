import javax.swing.text.Utilities;
import java.util.Arrays;

public class ArraysII_1

{
 public static void main(String[] args)
 {
     int[] num = new int[10];
     Utilidades.rellenaArray(num, 0, 10);
     System.out.println("Original Array : " + Arrays.toString(num));
     int ri = -1;

     do
     {
        ri = Utilidades.leerEntero("Introduce un numero entre 0 y " + (num.length -1) + ":");
     }
     while ((ri<0) || (ri > num.length -1));

     int numAMover = num[ri]; //esto hace una copia del numero a mover.
     for (int i = ri; i < num.length-1 ; i++)
     {
        num[i] = num[i+1];
     }

     num[num.length-1] = numAMover;
     System.out.println(Arrays.toString(num));


 }

}

