package product.model.dao;

import product.model.entities.Product;

import java.util.List;

public class ProductRepository implements Repository <Product, Integer>{
    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Integer delete(Integer integer) {
        return 0;
    }
}
