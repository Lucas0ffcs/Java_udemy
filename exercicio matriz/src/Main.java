import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cont = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a ordem de sua matriz:");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        String vect = "";


        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.println("Digite o elemento da matriz:");
                matrix[i][j] = sc.nextInt();

            }
        }
        for( int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                cont++;

                System.out.print(matrix[i][j]);
                if(cont%n!=0){

                    System.out.print(", ");
                }
                if(i==j){
                    vect += matrix[i][j];
                }


            }



        }
        System.out.println("\n" + vect.charAt(0));

    }
}
