package com.iba.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.InetAddress;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}

	@GetMapping("/version")
	public String version() throws IOException {
		InetAddress addr = InetAddress.getLocalHost();
		return "Version:0.0.1-SNAPSHOT" + "\nLocal HostAddress: "+addr.getHostAddress() + "\nLocal host name: "+ addr.getHostName();
	}
}
