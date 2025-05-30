package product.mapper;

import product.model.dto.ProductCreateDto;
import product.model.dto.ProductResponseDto;
import product.model.entities.Product;

import java.util.Random;
import java.util.UUID;

public class ProductMapper {
    public static ProductResponseDto mapFromProducttoProductResponseDto(Product product) {
        return new ProductResponseDto(product.getUuid()
        ,product.getPName(),product.getExpiredDate());//get uuid,name,date
    }
    public static Product mapFromProductCreateDtoToProduct(ProductCreateDto productCreateDto){
        return new Product(new Random().nextInt(99999999),
                UUID.randomUUID().toString(),
                productCreateDto.pName(),productCreateDto.expiredDate());
    }
}
