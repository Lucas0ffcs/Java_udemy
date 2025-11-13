public class Busca {
    int cont = 0;


    public static String buscador(int[][] matrixx, int linhas, int colunas, int busca){

        String pos = "";
        int cont = 0;
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(matrixx[i][j]==busca){
                    cont++;
                    pos += i + "," + j +",";
                }
            }
        }
        return pos;
    }
}