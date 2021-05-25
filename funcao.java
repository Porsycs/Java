import java.util.Scanner;

public class funcao {
    //Tanto faz em java as funçoes no inicio ou fim do programa
    public static int max(int x ,int y ,int z) {
        int aux;
        if(x>y && x>z) {
            aux = x;
        }
        else if(y>z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.printf("Maior é: %d",value);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tres numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a,b,c);

        showResult(higher);
        sc.close();
    }
 
}
