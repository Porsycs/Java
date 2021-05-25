import java.util.Locale;
import java.util.Scanner;


public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();
        double[] vect = new double[n]; //Declaração de array
        for(int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0;
        for(int i = 0;i < n; i++) {
            sum+=vect[i];
        }
        double avg = sum / n;
        System.out.printf("Average Height: %.2f",avg);



        sc.close();
    }
}
