package co.istad.mvcapp.view;

import co.istad.mvcapp.controller.ProductController;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;
import java.util.Scanner;
import java.util.UUID;

public class WelcomeView {
    public static void welcomeView(){
        System.out.println("-------------------------");
        System.out.println("Welcome to My Application");
        System.out.println("-------------------------");
        System.out.println("1 -> Create new product");
        System.out.println("2 -> List all products");
        System.out.println("3 -> Edit products");
        System.out.println("4 -> Remove products");
        System.out.println("5 -> Exit Application.");
        while (true){
            System.out.print("Choose option -> ");
            int option =InputView.getInput(new Scanner(System.in));
            ProductController controller = new ProductController();
            switch (option){
                case 1->{
                    CreateProductDto createProductDto = new CreateProductDto(1001,"Book",10.0);
                    ProductDto productDto = controller.handleCreatNewProduct(createProductDto);
                    System.out.println("Product is created Successfully.");
                    System.out.println(productDto);
                    ProductListView.productListView(controller.handleProductList());
                }
                case 2->{
                    ProductListView.productListView(controller.handleProductList());
                }
                case 3->{
                    UUID uuid = UUID.fromString(InputView.getInputData(new Scanner(System.in)));
                    controller.handleRemoveByProduct(uuid);
                    ProductListView.productListView(controller.handleProductList());
                }
                case 4->{

                }
                case 5->{
                    System.exit(0);
                }
                default -> System.out.println("Invalid Option...!");
            }
        }
    }
}
