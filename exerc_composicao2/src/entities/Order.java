package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {

    //Atributos primitivos
    private Integer id;
    private String status;

    //Atributos classe
    private List<Item> items = new ArrayList<>();
    private Client client;


    public Order() {
    }
    //O construtor nao deve conter parametros de atributos que são listas (item)


    public Order(Integer id, Client client, String status) {
        this.id = id;
        this.client = client;
        this.status = status;
    }



    //                  MÉTODOS

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
    public Double totalValue(){
        Double sum = 0.0;
        for(Item i : items){
            sum += i.getPrice();

        }
        return sum;
    }







    // GETTERS & SETTERS


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItem() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}