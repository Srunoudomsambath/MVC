package product.mapper;

import product.model.dto.ProductResponseDto;
import product.model.entities.Product;

public class ProductMapper {
    public static ProductResponseDto mapFromProducttoProductResponseDto(Product product) {
        return new ProductResponseDto(product.get);//get uuid,name,date
    }
}
