package com.serveur.gestion_serveur_backend;

import com.serveur.gestion_serveur_backend.enumeration.Status;
import com.serveur.gestion_serveur_backend.model.Server;
import com.serveur.gestion_serveur_backend.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionServeurBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionServeurBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository){
		return  args -> {
			serverRepository.save(new Server(null,"192.168.1.160","Ubuntu Linux 1","8 GB","Personal PC 1","http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepository.save(new Server(null,"192.168.1.161","Ubuntu Linux 2","16 GB","Personal PC 1","http://localhost:8080/server/image/server2.png", Status.SERVER_DOWN));
			serverRepository.save(new Server(null,"192.168.1.162","Ubuntu Linux 3","32 GB","Personal PC 1","http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverRepository.save(new Server(null,"192.168.1.163","Ubuntu Linux 4","64 GB","Personal PC 1","http://localhost:8080/server/image/server4.png", Status.SERVER_DOWN));
		};
	}

}
