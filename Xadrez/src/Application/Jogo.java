package Application;

public class Jogo {
    public static void main(String[] args) {
        String[][] malha = new String[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j<8;j++){
                malha[i][j] = "|";
                System.out.println(malha[i][j]);
            }

        }

    }
}
