import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  asciiValue="";

        asciiValue= sc.nextLine();

        byte[] bytes = asciiValue.getBytes(StandardCharsets.US_ASCII);

        System.out.println("ASCII Numeric Value: "+bytes[0]);

    }
}