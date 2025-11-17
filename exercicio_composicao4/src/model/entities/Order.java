package model.entities;

import model.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client orderClient;

    private List<OrderItem> items = new ArrayList<>();




    public Order(){}

    public Order(Client orderClient, OrderStatus status, Date moment) {
        this.orderClient = orderClient;
        this.status = status;
        this.moment = moment;
    }


    //MÉTODOS


    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public Double total(){
        //preencher
    }








    //GETTERS & SETTERS


    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(Client orderClient) {
        this.orderClient = orderClient;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
