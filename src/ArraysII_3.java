import java.util.Arrays;

public class ArraysII_3 {
    public static String comunes(int[] num, int[] num2) {
        String comunes = "";

        for (int i = 0; i < num.length; i++)
        {
            for (int j = 0; j < num2.length; j++) {
                if (num[i] == num2[j]) {
                    comunes += num2[j];
                    break;
                }
            }
        }
        return comunes;
    }

    public static void main(String[] args) {
        int[] num = new int[10];
        int[] num2= new int[10];


        Utilidades.rellenaArray(num, 0, 10);
        Utilidades.rellenaArray(num2, 0, 10);
        System.out.println(comunes(num, num2));
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
    }
}
