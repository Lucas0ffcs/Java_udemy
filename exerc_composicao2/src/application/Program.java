package application;

import entities.Client;
import entities.Item;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");

        System.out.println("Name: ");
        String clientName = sc.next();

        System.out.println("Email: ");
        String clientEmail = sc.next();


        Client client1 = new Client(clientName, clientEmail);

        System.out.print("How many items in the order? ");
        int z = sc.nextInt();

        for (int i = 1; i<=z; i++){
            System.out.println("Enter item #" + i + " data:");
            System.out.println("Item name: ");
            String itemName = sc.next();

            System.out.println("Price: ");
            Double itemPrice = sc.nextDouble();
            Item item = new Item(itemName, itemPrice);

        }









    }
}
