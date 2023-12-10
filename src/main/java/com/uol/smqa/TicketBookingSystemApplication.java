package com.uol.smqa;

import com.uol.smqa.model.Admin;
import com.uol.smqa.model.Users;
import com.uol.smqa.repository.AdminRepository;
import com.uol.smqa.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TicketBookingSystemApplication implements ApplicationRunner {

	private final UsersRepository usersRepository;
	private final PasswordEncoder passwordEncoder;
	private final AdminRepository adminRepository;

	@Autowired
	public TicketBookingSystemApplication(UsersRepository usersRepository,
										  PasswordEncoder passwordEncoder,
										  AdminRepository adminRepository) {
		this.usersRepository = usersRepository;
		this.passwordEncoder = passwordEncoder;
		this.adminRepository = adminRepository;
	}

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

			Admin adminInfo = new Admin();
			adminRepository.save(adminInfo);
		}

	}
}
