package com.uol.smqa;

import com.uol.smqa.model.Users;
import com.uol.smqa.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TicketBookingSystemApplication implements ApplicationRunner {

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingSystemApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		if (!usersRepository.existsByUsername("admin@tbs.com")) {
			Users admin = new Users();
			admin.setUsername("admin@tbs.com");
			admin.setPassword(passwordEncoder.encode("password"));
			admin.setActive(true);
			usersRepository.save(admin);
		}

	}
}
