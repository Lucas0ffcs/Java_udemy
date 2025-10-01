import java.security.ProtectionDomain;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos produtos deseja armazenar:");
        int n = sc.nextInt();
        Product[] vetor = new Product[n];



        for(int i = 0; i< vetor.length; i++){
            System.out.println("Digite o nome do produto:");
            String nome = sc.next();
            System.out.println("Digite o preço do produto:");
            double preco= sc.nextDouble();
            vetor[i] = new Product(nome, preco);
            soma+= vetor[i].getPreco();
        }
        double media = soma/n;
        System.out.println("O preço médio dos produtos é: " + media);

    }
}
