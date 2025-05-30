package product.view;

import product.controller.ProductController;
import product.model.dto.ProductCreateDto;
import product.model.dto.ProductResponseDto;
import product.model.dto.UpdateProductDto;
import product.model.service.ProductService;

import java.time.LocalDate;
import java.util.Scanner;

public class UI {
    private static final ProductController productController
            = new ProductController();
    private static void thumbnail(){
        System.out.println("============================");
        System.out.println("      Product Inventory     ");
        System.out.println("============================");
        System.out.println("""
                1. Get All Products
                2. Add New Product 
                3. Update Product 
                4. Delete Product
                5. Exit """);
    }
    public static void home(){
        while(true) {
            thumbnail();
            System.out.println("Enter your choice: ");
            switch (new Scanner(System.in).nextInt()){
                case 1->{
                    productController.getAllProducts().forEach(System.out::println);
                }
                case 2->{
                    System.out.println("Enter product name: ");
                    String pName = new Scanner(System.in).nextLine();
                    System.out.print("[+] Insert Expire Year: ");
                    int year = new Scanner(System.in).nextInt();
                    System.out.print("[+] Insert Expire Month: ");
                    int month = new Scanner(System.in).nextInt();
                    System.out.print("[+] Insert Expire Day: ");
                    int day = new Scanner(System.in).nextInt();
                    ProductCreateDto productCreateDto =
                            new ProductCreateDto(pName,LocalDate.of(year,month,day));
                    ProductResponseDto product = productController.insertProduct(productCreateDto);
                    System.out.println(product);
                }
                case 3->{
                    System.out.println("Enter Product Uuid: ");
                    String uuid = new Scanner(System.in).nextLine();
                    System.out.println("Enter new product name: ");
                    String newPName = new Scanner(System.in).nextLine();
                    ProductResponseDto updateProduct = productController
                            .updateProductByUuid(uuid,new UpdateProductDto(newPName));
                    System.out.println(updateProduct);
                }
                case 4->{
                    System.out.println("Enter Product Uuid to delete: ");
                    String uuid = new Scanner(System.in).nextLine();
                    productController.deleteProductByUuid(uuid);

                }

            }
            }
        }
    }
