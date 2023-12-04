public class Arrays4
{
    public static void main(String[] args)
    {
        int[] notas = {10, 6, 8, 4, 5, 6, 7, 8, 9, 10};
        int media = 0;
        for (int i = 0; i < notas.length ; i++)
        {
            media += notas[i];
        }


        System.out.println((float)media/10);


    }
}
