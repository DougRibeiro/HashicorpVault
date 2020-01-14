package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.vault.annotation.VaultPropertySource;


/*
 * https://spring.io/guides/gs/vault-config/
 * 
 * $ vault kv put secret/gs-vault-config example.username=localvault example.password=localvault
 * $ vault kv put secret/gs-vault-config/cloud example.username=localvault example.password=localvault
 * 
 */

@SpringBootApplication
@VaultPropertySource("secret/data/gs-vault-config")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
