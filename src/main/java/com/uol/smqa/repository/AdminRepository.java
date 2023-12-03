package com.uol.smqa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.uol.smqa.model.Admin;
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
}



