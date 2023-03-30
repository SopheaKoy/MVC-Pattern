package co.istad.mvcapp.model;

import java.util.UUID;

public class Product {
    private UUID id;
    private Integer code;
    private String name;
    private Double qty;
    private Double price;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product() {}

    public Product(UUID id, Integer code, String name, Double qty, Double price) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}

