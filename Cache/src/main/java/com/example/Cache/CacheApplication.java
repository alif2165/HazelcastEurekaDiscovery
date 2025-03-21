package com.example.Cache;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}

	@Bean
	public Config hazelcastConfig() {
		Config config = new Config();
		config.setClusterName("Hazelcast Cluster");
		config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
		config.getNetworkConfig().getJoin().getEurekaConfig()
				.setEnabled(true)
				.setProperty("self-registration", "true")
				.setProperty("namespace", "hazelcast")
				.setProperty("use-classpath-eureka-client-props","false")
				.setProperty("shouldUseDns","false")
				.setProperty("name","hazelcast-test")
				.setProperty("serviceUrl.default","http://localhost:8761/eureka/");

		return config;
	}
	@Bean
	public HazelcastInstance hazelcastInstance(Config config) {
		return Hazelcast.newHazelcastInstance(config);
	}
}
