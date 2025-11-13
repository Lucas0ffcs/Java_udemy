import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int m;

        int n;


        System.out.println("Digite a quantidade de linhas em sua matriz:");
        m = sc.nextInt();


        System.out.println("Digite a quantidade de colunas em sua matriz:");
        n = sc.nextInt();




        int[][] matrix = new int[m][n];




        for(int i = 0; i < m; i++){
            for(int j = 0; j< n; j++){
                System.out.println("Digite o elemento da matriz:");
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








    }
}
