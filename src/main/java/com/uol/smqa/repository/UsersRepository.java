package com.uol.smqa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uol.smqa.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

}
