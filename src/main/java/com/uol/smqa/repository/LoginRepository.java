package com.uol.smqa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uol.smqa.model.Customer;
import com.uol.smqa.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

}
