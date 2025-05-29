package product.model.service;

import product.model.dto.ProductCreateDto;
import product.model.dto.ProductResponseDto;

import java.util.List;

public class ProductService {
    List<ProductResponseDto> getAllProducts() ;
    ProductResponseDto insertNewProduct(ProductCreateDto product);
    Integer deleteProductByUuid(String uuid);
    ProductResponseDto getProductByUuid(String uuid);
}
