package com.uol.smqa;

import com.uol.smqa.model.Users;
import com.uol.smqa.repository.UsersRepository;
import com.uol.smqa.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@SpringBootApplication
@RequiredArgsConstructor
public class TicketBookingSystemApplication implements ApplicationRunner {
	private final UsersService usersService;
	private final UsersRepository usersRepository;
	private final PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingSystemApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Optional<Users> adminUser = usersService.findByEmail("admin@tbs.com");
		if (!adminUser.isPresent()) {
			Users admin = new Users();
			admin.setUsername("admin@tbs.com");
			admin.setPassword(passwordEncoder.encode("password"));
			admin.setActive(true);
			usersRepository.save(admin);
		}

	}
}
