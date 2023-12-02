package com.uol.smqa.repository;

import com.uol.smqa.model.PasswordResetHistory;
import com.uol.smqa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PasswordResetHistoryRepository extends JpaRepository<PasswordResetHistory, Integer>{
}
