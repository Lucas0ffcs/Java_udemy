package model.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;


    private Product orderItemProduct;


    public OrderItem(){}

    public OrderItem(Integer quantity, Product orderProduct, Double price) {
        this.quantity = quantity;
        this.orderItemProduct = orderProduct;
        this.price = price;
    }

    //MÉTODOS

    public Double subTotal(){
        //preencher
    }










    //GETTERS & SETTERS


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getOrderProduct() {
        return orderItemProduct;
    }

    public void setOrderProduct(Product orderProduct) {
        this.orderItemProduct = orderProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
