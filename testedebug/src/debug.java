import java.util.Scanner;

public class debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas pessoas teram suas alturas registradas:");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

    }
}
