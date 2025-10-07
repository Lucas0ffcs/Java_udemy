import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m;
        int n;
        int x;
        System.out.println("Digite a quantidade de linhas em sua matriz:");
        m = sc.nextInt();
        System.out.println("Digite a quantidade de colunas em sua matriz:");
        n = sc.nextInt();
        sc.nextLine();

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++){

            System.out.println("Digite os elementos da linha:");
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }

        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j==0){
                    System.out.println();
                }
                if(j==n-1){
                    System.out.print(matrix[i][j]);
                }else{
                    System.out.print(matrix[i][j] + ", ");
                }

            }
        }
        System.out.println("\nDigite o elemento: ");
        x = sc.nextInt();
        Busca.buscar(matrix, m, n, x);


        sc.close();
    }
}
