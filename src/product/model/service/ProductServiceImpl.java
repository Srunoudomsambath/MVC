package product.model.service;

import product.mapper.ProductMapper;
import product.model.ProductData;
import product.model.dao.ProductRepository;
import product.model.dto.ProductCreateDto;
import product.model.dto.ProductResponseDto;
import product.model.dto.UpdateProductDto;
import product.model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository = new ProductRepository();
    @Override
    public List<ProductResponseDto> getAllProducts() {
        List<ProductResponseDto> productResponseDtoList
                = new ArrayList<>();
        productRepository.findAll()
                .stream()
                .forEach(p->{
                    productResponseDtoList
                            .add(new ProductResponseDto(p.getUuid()
                                    , p.getPName(),
                                    p.getExpiredDate()));
                });
        return productResponseDtoList;
    }

    @Override
    public ProductResponseDto insertNewProduct(ProductCreateDto productCreateDto) {
        Product product1 = ProductMapper.mapFromProductCreateDtoToProduct(productCreateDto);
        return ProductMapper.mapFromProducttoProductResponseDto(
                productRepository.save(product1)
        );
    }

    @Override
    public Integer deleteProductByUuid(String uuid) {
        try{
            Product product = ProductData.products.stream()
                    .filter(p->p.getUuid().equals(uuid))
                    .findFirst().get();
            return productRepository.delete((product.getId()));
        }catch (NoSuchElementException exception){
            System.out.println("Error during deleting Product by uuid : " + exception.getMessage());
        }

        return 0;
    }

    @Override
    public ProductResponseDto getProductByUuid(String uuid) {
        try{
            return ProductMapper.mapFromProducttoProductResponseDto(
                    productRepository.findByProductUuid(uuid)
            );
        }catch(NoSuchElementException exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public ProductResponseDto updateProductByUuid(String uuid, UpdateProductDto updateProductDto) {
        try{
            return ProductMapper.mapFromProducttoProductResponseDto(
                    productRepository.updateProductBuuuid(uuid,updateProductDto)

            );
        }catch (NoSuchElementException exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }
}
