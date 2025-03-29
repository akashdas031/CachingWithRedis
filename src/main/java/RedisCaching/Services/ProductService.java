package RedisCaching.Services;

import java.util.List;

import RedisCaching.Entities.Product;

public interface ProductService {
	Product createProduct(Product product);
	List<Product> getAllProducts();
	Product getSinleProduct(String productId);
	Product updateProduct(Product product,String productId);
	boolean removeProduct(String productId);
}
