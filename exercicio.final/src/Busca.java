public class Busca {


    public static void buscar(int[][] matriz, int m, int n, int x){


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j]==x){

                    System.out.println("Position: " + i +", "+ j);
                    near(i, j, matriz, m, n);
                }
            }
        }

    }
    public static void near(int i, int j, int[][] matriz, int m, int n){
        if(!(j-1<0)){//ESQUERDA
            System.out.println("Left: " + matriz[i][j-1]);
        }
        if(!(j+1==n)){//DIREITA
            System.out.println("Right: " + matriz[i][j+1]);
        }
        if(!(i-1<0)){//CIMA
            System.out.println("Up: " + matriz[i-1][j]);
        }
        if(!(i+1==m)){//CIMA
            System.out.println("Down: " + matriz[i+1][j]);
        }



    }
}
