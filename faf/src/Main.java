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
        sc.nextLine();
        int[][] matriz = new int[m][n];

        for(int i  = 0; i<m; i++){
            System.out.println("Digite os elementos da linha:");
            String string = sc.nextLine();
            String[] splitted = string.split(" ", n);
            for(int d = 0; d < n; d++){
                matriz[i][d] = Integer.parseInt(splitted[d]);
            }
        }

        System.out.println("Digite o número X");
        int x = sc.nextInt();


        String[] posicaostr = Busca.buscador(matriz, m, n, x).split(",");
        int[] posicao = new int[posicaostr.length];

        for(int d = 0; d < n; d++){
            posicao[d] = Integer.parseInt(posicaostr[d]);
        }

        for(int i = 0; i < posicao.length; i++){
            System.out.println("Position: " + posicao[i] + ", " + posicao[i+1]);


        }




        /*for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

            }

        }
        */









        /*
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++){
                if(j==0){
                    System.out.println();
                }
                if(j==n-1){
                    System.out.print(matriz[i][j]);
                }else{
                    System.out.print(matriz[i][j] + ", ");
                }

            }
        }
         */





    }
}
