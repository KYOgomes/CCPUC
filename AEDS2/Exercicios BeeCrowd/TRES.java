//calcular a area de um circulo
import java.util.Scanner;
import java.lang.Math;

public class TRES {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double raio, area;
        raio = sc.nextInt();
        area = 3.14159 * (Math.pow(raio, 2));
        System.out.println(area);
        sc.close();
    }
}
