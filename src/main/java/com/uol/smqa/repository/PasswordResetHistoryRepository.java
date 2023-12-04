package com.uol.smqa.repository;

import com.uol.smqa.model.PasswordResetHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PasswordResetHistoryRepository extends JpaRepository<PasswordResetHistory, Integer>{
}
