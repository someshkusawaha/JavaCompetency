package com.javacompentency.Calculator.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

@Configuration
public class RedisCacheConfig {

	@Primary
	@Bean
	RedisCacheManager cacheManager(final RedisConnectionFactory connectionFactory) {
		final RedisCacheWriter redisCacheWriter = RedisCacheWriter.lockingRedisCacheWriter(connectionFactory);
		final RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig();
		final RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter, cacheConfiguration);
		return redisCacheManager;
	}

	@Bean(name = "RequestResponseCacheManager")
	RedisCacheManager requestResponseCacheManager(final RedisConnectionFactory connectionFactory) {
		final RedisCacheWriter redisCacheWriter = RedisCacheWriter.lockingRedisCacheWriter(connectionFactory);
		RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig();
		cacheConfiguration = cacheConfiguration.entryTtl(Duration.ofSeconds(60));
		final RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter, cacheConfiguration);
		return redisCacheManager;
	}
}
