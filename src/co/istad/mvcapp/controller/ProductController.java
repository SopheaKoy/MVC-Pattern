package co.istad.mvcapp.controller;

import co.istad.mvcapp.dao.ProductDaompl;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.model.Product;
import java.util.List;
import java.util.UUID;

public class ProductController {
    // create reference
    private final ProductDaompl productDaompl;
    public ProductController(){
        productDaompl = new ProductDaompl();
    }
    public List<ProductDto> handleProductList(){
        return productDaompl.select();
    }
    public ProductDto handleCreatNewProduct(CreateProductDto createProductDto){
        return productDaompl.insert(createProductDto);
    }
    public void handleRemoveByProduct(UUID uuid){
        productDaompl.removeByUUID(uuid);
    }
}
