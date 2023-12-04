
public class Refuerzo_tiempo

{
    public static void main (String[] args) throws InterruptedException {
        int horas = 9;
        int minutos = 1;
        int segundos = 40;

        do
        {

            segundos++;
            if(horas == 24)
            {
                horas = 0;
            }

            if (minutos == 60)
            {
                minutos = 0;
                horas++;
            }
            if (segundos ==60)
            {
                segundos = 0;
                minutos++;
            }

            Thread.sleep(1000);
            System.out.printf("\n" +horas+":"+minutos+":"+segundos);
            System.out.flush();
        }while (horas != 23);
    }
}
