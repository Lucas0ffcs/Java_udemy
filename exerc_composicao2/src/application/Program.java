package application;

import entities.Client;
import entities.Item;
import entities.Order;

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
        Order order1 = new Order(1, client1, "Pending");

        System.out.print("How many items in the order? ");
        int z = sc.nextInt();

        for (int i = 1; i<=z; i++){
            System.out.println("Enter item #" + i + " data:");
            System.out.println("Item name: ");
            String itemName = sc.next();

            System.out.println("Price: ");
            Double itemPrice = sc.nextDouble();
            Item item = new Item(itemName, itemPrice);
            order1.addItem(item);
        }
        System.out.println("-----");
        System.out.println("Order ID: "+ order1.getId());
        System.out.println("Status: "+ order1.getStatus());
        System.out.println("Client: "+ order1.getClient().getName());
        System.out.println("Total items: "+ z);

        System.out.println("\nOrder total calculation...\n");

        System.out.println("Name: "+ order1.getClient().getName());
        System.out.println("Email: "+ order1.getClient().getEmail());
        System.out.println("Total order value: "+ order1.totalValue());

        sc.close();

    }
}
