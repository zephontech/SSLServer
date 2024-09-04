package com.ssl.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
            System.setProperty("javax.net.debug", "ssl:handshake");
		SpringApplication.run(ServerApplication.class, args);
	}

}
