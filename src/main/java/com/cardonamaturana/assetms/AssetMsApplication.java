package com.cardonamaturana.assetms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class AssetMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetMsApplication.class, args);
	}

}
