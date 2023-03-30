package co.istad.mvcapp.datasource;

import co.istad.mvcapp.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class StaticDataSource {
    private List<Product> products ;
    public StaticDataSource(){
        products = new ArrayList<>();
        products.add(new Product(UUID.randomUUID(),1001,"Mouse",20.0,20.0));
        products.add(new Product(UUID.randomUUID(),1002,"Pen",10.0,10.0));
        products.add(new Product(UUID.randomUUID(),1003,"Pencil",30.0,50.0));
    }
    public List<Product> getProducts (){
        return products;
    }
    public void setProducts(List<Product> products){
        this.products =products;
    }

}
