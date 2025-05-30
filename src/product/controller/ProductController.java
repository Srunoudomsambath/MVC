package product.controller;

import product.model.dto.ProductCreateDto;
import product.model.dto.ProductResponseDto;
import product.model.dto.UpdateProductDto;
import product.model.service.ProductService;
import product.model.service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private ProductService productService = new ProductServiceImpl();
    public List<ProductResponseDto> getAllProducts() {return productService.getAllProducts();}
    public ProductResponseDto insertProduct(ProductCreateDto productCreateDto) {
        return productService
                .insertNewProduct(productCreateDto);
    }
    public ProductResponseDto getProductByUuid(String uuid) {return productService.getProductByUuid(uuid);}
    public Integer deleteProductByUuid(String uuid) {return productService.deleteProductByUuid(uuid);}
    public ProductResponseDto updateProductByUuid(String uuid,UpdateProductDto updateProductDto) {
        return productService.updateProductByUuid(uuid, updateProductDto);
    }
}
