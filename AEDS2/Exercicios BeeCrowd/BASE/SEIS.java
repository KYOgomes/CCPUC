package BASE;
//Media de dois valores
import java.util.Scanner;
public class SEIS {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double A, B, MEDIA;
        A = sc.nextDouble();
        B= sc.nextDouble();
        MEDIA = (A*3.5 + B*7.5)/11;
        System.out.printf("MEDIA = %.2f\n", MEDIA);
        sc.close();
    }
}
