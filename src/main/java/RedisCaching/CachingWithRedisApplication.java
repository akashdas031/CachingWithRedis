package RedisCaching;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import RedisCaching.Entities.Product;
import RedisCaching.RedisDataStorageTypes.RedisHashService;
import RedisCaching.RedisDataStorageTypes.RedisListService;
import RedisCaching.RedisDataStorageTypes.RedisSetService;
import RedisCaching.RedisDataStorageTypes.RedisSortedSetService;
//import RedisCaching.RedisDataStorageTypes.RedisStreamPublisherService;

@SpringBootApplication
@EnableCaching
public class CachingWithRedisApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(CachingWithRedisApplication.class);
	private RedisListService redisList;
	private RedisSetService redisSet;
	private RedisSortedSetService redisSortedSet;
	private RedisHashService redisHash;
	//private RedisStreamPublisherService redisStreamP;
	public CachingWithRedisApplication(RedisListService redisList,RedisSetService redisSet,RedisSortedSetService redisSortedSet,
			RedisHashService redisHash) {
		this.redisList=redisList;
		this.redisSet=redisSet;
		this.redisSortedSet=redisSortedSet;
		this.redisHash=redisHash;
		//this.redisStreamP=redisStreamP;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CachingWithRedisApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		Product product1 = Product.builder().productId("PR-1").productName("Product-1").productDEscription("Testing Redis List using spring boot app...").build();	
		Product product2 = Product.builder().productId("PR-2").productName("Product-2").productDEscription("Testing Redis List using spring boot app...").build();	
		Product product3 = Product.builder().productId("PR-3").productName("Product-3").productDEscription("Testing Redis List using spring boot app...").build();	
//		this.redisList.addToList(product1);
//		this.redisList.addToList(product2);
//		this.redisList.addToList(product3);
//		logger.info("This is the message : Products Successfully added in the list");
//		logger.info("------------------------------------------------------------------");
//		List<Object> products = this.redisList.getProducts();
//		logger.info("List of Products That added in the List : "+products);
//		this.redisList.removeProductFromList(product3);
//		logger.info("Product-3 Has been removed from the server successfully");
//		this.redisSet.addToRedisSet(product1);
//		this.redisSet.addToRedisSet(product2);
//		this.redisSet.addToRedisSet(product3);
//		this.redisSet.addToRedisSet(product3);
//		this.redisSet.addToRedisSet(product3);
//		logger.info("Products Successfully added in the Set");
//		logger.info("------------------------------------------------------------------");
//		Set<Object> products = this.redisSet.viewAllProductsFromSet();
//		logger.info("Products That added in the Redis Set : "+products);
//		logger.info("The product-3 you are looking for is available in server ?? "+this.redisSet.isAvailableInSet(product3));
//		this.redisSet.removeFromTheSet(product2);
//		logger.info("Product-2 Has been removed from the server successfully");
//		logger.info("The product-2 you are looking for is available in server ?? "+this.redisSet.isAvailableInSet(product2));
//		this.redisSortedSet.addProductToRedisSortedSet(product3, 3.4);
//		this.redisSortedSet.addProductToRedisSortedSet(product2, 3.4);
//		this.redisSortedSet.addProductToRedisSortedSet(product1, 3.4);
//		logger.info("Products Save to the Sorted Set of Redis :");
//	    logger.info("--------------------------------------------------");
//	    Set<Product> topNProducts = this.redisSortedSet.getTopNProducts(3);
////	    logger.info("Top Products from the Sorted Set : "+topNProducts);
//	    this.redisSortedSet.removeProductFromRedisSortedSet("PR-2");
//	    logger.info("Prodcut Removed from the Server...");
	
	}

}
