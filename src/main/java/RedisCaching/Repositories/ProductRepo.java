package RedisCaching.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import RedisCaching.Entities.Product;

public interface ProductRepo extends JpaRepository<Product,String>{

}
