package product.model.service;

import product.model.dto.ProductCreateDto;
import product.model.dto.ProductResponseDto;
import product.model.dto.UpdateProductDto;

import java.util.List;

public interface ProductService {
    List<ProductResponseDto> getAllProducts();
    ProductResponseDto insertNewProduct(ProductCreateDto product);
    Integer deleteProductByUuid(String uuid);
    ProductResponseDto getProductByUuid(String uuid);
    ProductResponseDto updateProductByUuid(String uuid, UpdateProductDto product);


}
