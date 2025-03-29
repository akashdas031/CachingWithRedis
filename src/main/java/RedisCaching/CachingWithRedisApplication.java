package RedisCaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CachingWithRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingWithRedisApplication.class, args);
	}

}
